import java.io.*;
import java.util.*;

public class Main {

    int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        out.println(new Main().solveMeFirst(a, b));

        in.close();
        out.close();
    }
}
