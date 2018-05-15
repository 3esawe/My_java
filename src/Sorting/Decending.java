package Sorting;
import java.util.*;
public class Decending {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("how many elemnts you want");
        int num = scanner.nextInt();
        int[] myArray = getInt(num);
        Sorting(myArray);
        print(myArray);
    }
    public static int[] getInt(int num){
        System.out.println("type "+num + " Elements");
        int[] myArray = new int[num];
        for (int i = 0 ; i < myArray.length ; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static void Sorting(int[] sorted){
        for (int i = 0 ; i < sorted.length; i++){
            int index = i;
            for (int j = i+1 ; j < sorted.length ; j++){
                if (sorted[j] > sorted[index]){
                    index = j ;
                }

            }
            int temp = sorted[i];
            sorted[i] = sorted[index];
            sorted[index] = temp;
        }
    }
    public static void print (int[]c){
        for (int i = 0 ; i < c.length; i++){
            System.out.println(c[i]);
        }
    }


}
