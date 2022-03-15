import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static int diagonalDifference(List<List<Integer>> arr)   {
        int sumX = 0;
        int sumY = 0;
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> ar = arr.get(i);
            for (int j = 0; j < ar.size(); j++) {
                if (i == j) {
                    sumX += ar.get(j);
                }
                if (i == ar.size() - j - 1) {
                    sumY += ar.get(j);
                }
            }
        }
        return Math.abs(sumX - sumY);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        List<List<Integer>> arr = new ArrayList<>();


        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            List<Integer> ar = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                ar.add(in.nextInt());
            }
            arr.add(ar);
        }

        out.println(diagonalDifference(arr));

        in.close();
        out.close();
    }
}
