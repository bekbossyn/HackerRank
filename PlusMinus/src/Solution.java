import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            int k = arr.get(i);
            if (k == 0) zero++;
            if (k > 0)  pos++;
            if (k < 0) neg++;
        }
        System.out.printf("%.6f%n", pos * 1.0 / n);
        System.out.printf("%.6f%n", neg * 1.0 / n);
        System.out.printf("%.6f%n", zero * 1.0 / n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        List<Integer> arr = new ArrayList<Integer>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        plusMinus(arr);

        in.close();
        out.close();
    }
}
