import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        if (s.charAt(s.length() - 2) == 'P') {
            int hour = Integer.parseInt(s.substring(0, 2));
            if (hour != 12)
                hour += 12;
            String subs = s.substring(2, s.length() - 2);
            s = String.valueOf(hour) + subs;
//            if (hour == 24) {
//                s = "00" + subs;
//            } else {
//                s = String.valueOf(hour) + subs;
//            }
        } else {
            int hour = Integer.parseInt(s.substring(0, 2));
            if (hour == 12) {
                s = "00" + s.substring(2);
            }
//            hour += 12;
//            s = String.valueOf(hour) + s.substring(2, s.length() - 2);
            s = s.substring(0, s.length() - 2);
        }
        return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
