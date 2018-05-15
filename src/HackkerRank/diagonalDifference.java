package HackkerRank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class diagonalDifference {
   static int Difference(int[][] a) {
        /*
         * Write your code here.
         */
        int  total_right = 0;
        int total_left = 0;
        for (int i = 0 ; i < a.length; i ++){
            total_right += a[i][i];
            total_left += a[i][i-a.length-1];
        }
        return  Math.abs(total_right - total_left);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = Difference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
