import java.lang.reflect.Array;
import java.util.*;

public class x<T> {
    private T last ;
    private int elem;


    public x() {
        this.last = null;
        this.elem = 0;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int [] []x =new int[4][2];
//        for (int i=0; i < x.length; i++){
//            for (int j = 0; j < x[i].length; j++){
//                x[i][j] = scanner.nextInt();
//            }
//        }
//        print(x);
//        reverse(x);
//        System.out.println("*************");
//        print(x);
//;      ;
        int y = 0;
        String x = "Ali";
        char[] z = x.toCharArray();
        for (char w : z ){
            y += w;
        }
        System.out.println(y);
//        System.out.println( RecursionbinarySearch(y,0,6,5));
////        reduce(x);
////        System.out.println(maxDifference(x));
////        String y = "omar";
//        int z = 5;
//        int r = 8;
//        z =r;
//        r = 5+5;
//        System.out.println(z);
//        x<Integer> itne = new x<>();
//        System.out.println(itne.add(3));
//        String[] array = {"a", "b", "c", "d", "e"};
//        method(array);
//        print(array);
//        System.out.println(factorial(7));
//        xMethod(5);


    }
    public static void print (int x [][]){
        for (int i=0; i < x.length; i++){
            System.out.println("row: " + (i+1));
            for (int j = 0; j < x[i].length; j++){
                System.out.println(" colum: " + (j+1)+ ": " + x[i][j]);
            }
        }
    }/*
    swap the row with the column and the oppsite*/
    static int[][] reverse (int [] [ ] x){

        int [][ ] y= new int[x[0].length][x.length] ;
        for (int i=0; i < y.length; i++){
            for (int j = 0; j < y[i].length; j++){
                y[i][j] = x[j][i];
            }
        }
        return y;
    }
    static int RecursionbinarySearch(int arr[], int l , int r , int x){
        if (x >=1) {
            int mid = l + (r - l) / 2;
            if (x == arr[mid])
                return mid;

                if (arr[mid] < x) {
                    return RecursionbinarySearch(arr, mid+1, r, x);
                }
                return RecursionbinarySearch(arr, l, mid -1, x);

        }

        return -1;
    }

    static int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length ;
        while (l <= r)
        {
            int m = l + (r-l)/2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
    public static void xMethod(int n){
        if (n>0){
            xMethod(n-1);
            System.out.print(n + " ");
        }
    }
    private static long factorial(int n)
    {
        if (n == 1){
            System.out.println(n);
            return 1;}

        System.out.println(n);
        int x = n;
        long result =factorial(n - 1);
        System.out.println(result + " " + x);
        return  result *x;

    }
    public static void print (String[] array){
        for (int i = 0 ; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public T add (T element){

        last = element;
        elem ++;
        return  last;
    }
    public static void reduce (int[] vals) {
        int minIndex =0;
        for (int i=0; i < vals.length; i++) {
            if (vals[i] < vals[minIndex] ) {
                minIndex = i;
            }
        }
        int minVal = vals[minIndex];
        for (int i=0; i < vals.length; i++) {
            vals[i] = vals[i] - minVal;
        }
    }
    public static int maxDifference (int[] vals) {
        int max = 0;
        for (int i=0; i < vals.length; i++) {
            for (int j=0; j < vals.length; j++) {
                if (vals[i] - vals[j] > max) {
                    max = vals[i] - vals[j];
                }
            }
        }
        return max;
    }
    private  static void method(String[] array){
        for(int i = 0; i < array.length / 2; i++){
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }


}
