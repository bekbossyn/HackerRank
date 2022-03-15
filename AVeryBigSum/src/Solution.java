import java.util.*;
import java.io.*;

public class Solution {

    long aVeryBigSum(int[] a)   {
        long sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args)  {

    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = in.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
    }

    out.println(new Solution().aVeryBigSum(a));

    in.close();
    out.close();

    }
}
