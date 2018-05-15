package HackkerRank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Birthday_Cake_Candles {
    public static int birthdayCakeCandles(int n, int[] ar) {
        int sum = 0;
        int max = 0;
        for (int i = 0 ; i < ar.length; i++){
            if (ar[i] > max ){
                max = ar[i];
            }

        }
        for (int i = 0 ; i < ar.length; i++){
            if (max >= ar[i] ){
                sum++;
            }

        }
        return sum;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}

