package HackkerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Plus_Minus {


        static void plusMinus(int[] arr) {
            int p = 0;
            int neg = 0;
            int zero = 0;
            for (int i  = 0 ; i < arr.length ; i++){
                if (arr[i] > 0 ){
                    p++;
                }
                else if ( arr[i] < 0){
                    neg ++;
                }
                else zero++;
            }
            System.out.printf("%.6f" ,(double) p / arr.length);
            System.out.printf("%.6f" ,(double) neg/ arr.length);
            System.out.printf("%.6f" , (double)zero / arr.length);

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            plusMinus(arr);
            in.close();
        }


}
