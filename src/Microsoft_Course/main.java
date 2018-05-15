package Microsoft_Course;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int [] x = {9,5,7,3,6,2,1};

        selectionSort(x);
        print(x);
    }
    static void linearSearch(int[] lst, int v) {
        int n = lst.length;
        for (int i = 0; i < n; i++) {
            if (lst[i] == v) {
                System.out.println("found! It is at: " + i);
                return;
            }
        }
        System.out.println("the element is not in the array");
        return;
    }
    public static void print(int[] x){
        for (int i = 0 ; i < x.length ; i ++){
            System.out.println(x[i]);
        }
    }
    static void sort (int [] x){
        for (int i=0; i < x.length; i++){
            int index = i;
            for (int j = i+1 ; j < x.length; j++){
              if (x[index] > x[j]){
                  index = j;
              }

            }

            int tmp = x[index];
            x[index] = x[i];
            x[i] =tmp;

        }
    }
    static void selectionSort(int[] lst) {
        // get the length
        int n = lst.length;
        for (int i = 0; i < n; i++) {
            int index = 0;
            int smallest = lst[i];
            for (int j = i; j < n; j++) {
                if (lst[j] < smallest) {
                    smallest = lst[j];
                    index = j;

                }
                int temp = lst[i];
                lst[i] = smallest;
                lst[index] = temp;
            }
        }
        System.out.println(Arrays.toString(lst));
    }
    static void bubbleSort(int[] lst) {
        int n = lst.length;
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 0; i < n-1; i++) {
                if (lst[i] > lst[i+1]) {
                    int temp = lst[i];
                    lst[i] = lst[i+1];
                    lst[i+1] = temp;
                    swapped = true;

                }
            }
        } while (swapped == true);

        System.out.println(Arrays.toString(lst));
    }
}
