package Sorting;
import java.util.*;
public class Main {
    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
      int[] myIntegers = getIntegers(100);
            SelectionSort(myIntegers);
            print(myIntegers);

////        print(myIntegers);
//        int [ ] w = {1,3,5,4,2,6};

    }
    public static void print(int[] x){
        for (int i = 0 ; i < x.length ; i ++){
            System.out.println(x[i]);
        }
    }
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        for(int i=0; i<array.length; i++) {
            array[i] = (int )(Math.random() *500000 + 1);
        }
        return array;
    }
    public static int[] sortedarray(int[] x){
        int[] sorted = Arrays.copyOf(x,x.length);
        boolean flag =true;
        int temp;
        while(flag) {
            flag = false;
            // element 0     160
            // element 1     50
            // element 2     40

            for(int i=0; i<sorted.length-1; i++) {
                if(sorted[i] < sorted[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sorted;
    }
    public static void SelectionSort(int [] y){

        for (int i = 0; i < y.length - 1; i++)// we loop through the array we do minus 1 cz the length doesnt count the array from 0
        {
            int indexMin = i;  // we assign the minIndex to the i (the starter value)
            for (int MinValue = i + 1; MinValue < y.length; MinValue++){ // this inner loop comparing the minIndex  with the next indexMin (minIndex+1)
                if (y[MinValue] < y[indexMin]){ //if the Minvalue value is < than minIndex value
                    indexMin = MinValue;//searching for lowest indexMin put the MinValue index to the indexMin
                }// the index min is recording the index of the smallest elements remeaning
            }
            int smallerNumber = y[indexMin]; // we create new value we call it smaller number it would be assined the value of the lowest
            y[indexMin] = y[i]; // we move the biggest element which is in the first position to be the last element in our array and assign it the number
            y[i] = smallerNumber; // we move the smallest number to the first position which we assign it before from the [indexMin]
        }

    }
    static long x = System.nanoTime();
    public static void insertion(int [ ] x){
        for (int i = 1 ; i < x.length ; i++){ // we loop through the array
            int minIndex = i; // we put our minIndex at the index of our first iteration
            while (minIndex > 0 && x[minIndex]< x[minIndex -1]){ // we check that if the value in x[minIndex] is < x[minIndex -1] we should swap both values
                int lowernumber = x[minIndex]; // we assign the smallets value to our varible
                x[minIndex] = x[minIndex -1]; // we swap the value of x[minIndex -1] which is bigger than the value of x[minIndex]
                x[minIndex -1] = lowernumber; // we assign the value of our lowernumber to be before the x[minIndex] to make it Ascending order
                minIndex = minIndex - 1; // decreament our to recheck that the values in the array are sorted for example if the element in minindex  3 is = 9 and i is 3 so we check if 9 < 10 that's true so we decreament and in this to keep checking to the last of the array and of the condition doesn't met we go out from the while loop

            }
        }

    }
    static long y =System.nanoTime();
    static long z = y-x;


}


/*(Selection Sort) we look for the smallest element in the array and we put it in the prober location*/