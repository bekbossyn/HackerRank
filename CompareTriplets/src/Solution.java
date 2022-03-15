import java.util.*;
import java.io.*;

public class Solution {

    int[] compareTriplets(int[] a, int [] b) {
        int[] c =  new int[2];
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i])
                c[0]++;
            else if (a[i] < b[i])
                c[1]++;
        }
        return c;
    }

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int []a = new int[3];
        int []b = new int[3];

        for (int i = 0; i < 3; i++)
            a[i] = in.nextInt();

        for (int i = 0; i < 3; i++)
            b[i] = in.nextInt();

        int[] c = new int[2];

        c = new Solution().compareTriplets(a, b);
        for (int i = 0; i < 2; i++)
            out.print(c[i] + " ");

        in.close();
        out.close();

    }

}
