import java.io.*;

class Result {

    /*
     * Complete the 'andProduct' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER a
     *  2. LONG_INTEGER b
     */

    public static long andProduct(long a, long b) {

//        long k = 2;
//        long res = a;
//        for (long i = a; i <= b; i += k) {
//            res = res & i;
//            k = k * 2;
//        }
//        return res & b;

        // a = 42 = 101010 110101
        // b = 57 = 111001 100110

        String aInt = Long.toBinaryString(a);
        String bInt = Long.toBinaryString(b);
//        System.out.println(aInt);
//        System.out.println(bInt);
        if (aInt.length() != bInt.length()) return 0;
//        StringBuilder cInt = new StringBuilder();
        String cInt = "";
        boolean used = false;
        for (int i = 0; i < aInt.length(); i++) {
            if (aInt.charAt(i) == bInt.charAt(i) && used == false)
                cInt = cInt + aInt.charAt(i);
//            if (aInt.charAt(i) == '1' && bInt.charAt(i) == '1')
////                cInt.insert(0, '1');
//                cInt = '1' + cInt;
            else
                used = true;
//                break;
        }
//        while (cInt.length() < aInt.length()) cInt.insert(cInt.length(), '0');
        while (cInt.length() < aInt.length()) cInt += '0';
//        String str = cInt.toString();
//        return Long.parseLong(str, 2);
        return Long.parseLong(cInt, 2);

        /*
        long count = 0;
        long res = a;
        for (long i = a; i <= b; i++)   {
            res = res & i;
            count++;
            if (count > 1000) break;
            System.out.println("i: " + i + " result: " + res);
        }
        return 0;
        */
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("output.txt")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int nItr = 0; nItr < n; nItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            long a = Long.parseLong(firstMultipleInput[0]);

            long b = Long.parseLong(firstMultipleInput[1]);

            long result = Result.andProduct(a, b);

            System.out.println(result);
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
