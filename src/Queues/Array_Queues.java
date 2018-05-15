package Queues;

import java.lang.reflect.Array;

public class Array_Queues<E> {


    private int numElements;

    /** Array to save elements **/
    private int elements[];

    /** Indice to last element */
    private int last;

    public Array_Queues(int numElements) {
        this.numElements = numElements;
        elements = new int[numElements];
        last = -1;
    }
    public boolean isEmpty(){
        // my implementation
        boolean result = false;
        if (last < 0) result = true;
        return result;
    }

    /** Is full the queue */
    public boolean isFull(){
        // todo
        boolean result = false;
        if (last == numElements-1) result = true;
        return result;
    }

    /** Insert an element in the queue */
    public void enqueue(int element){
        // my implementation
        if (!isFull()) {
            elements[++last] = element;
        } else {
            System.out.println("List is full."); //can put exception later
        }

    }

    /** Extract the element in the queue.
     *  There isn't control error */
    public int dequeue(){
        // my implementation
        if (!isEmpty()) {
            return(elements[last--]);
        } else return 0;
    }

    /** Returns the number of elements in the queue */
    public int numElements(){
        // my implementation
        return last+1;
    }

    /** Print the elements in the queue*/
    public void print() {
        // my implementation
        if (isEmpty()) {
            System.out.println("The list is empty, thus nothing will be printed."); //could be an exception

        } else {
            for (int i = 0; i <= last; i++) {
                System.out.print(elements[i]+" ");
            }
        }
    }//print


    public static void main(String args[]){
        // test the class
        System.out.println("Test the queue class");
        Array_Queues mine = new Array_Queues(10);
        System.out.println("Is the queue empty? "+mine.isEmpty());
        mine.print();
        System.out.println("Will fill up the queue.");

        for (int i = 0; i <11; i++) {
            mine.enqueue(i);
        }

        System.out.println("Is the queue full? "+mine.isFull());
        mine.print();
        System.out.println("Let us dequeue "+mine.dequeue());
        mine.print();
        System.out.println("Is the queue full? "+mine.isFull());
        System.out.println("The queue has now "+mine.numElements()+" elements.");
        System.out.println("Let us enqueue 15, then dequeue.");
        mine.enqueue(15);
        mine.print();
        System.out.println("The queue has now "+mine.numElements()+" elements.");
        System.out.println(mine.dequeue());
        System.out.println("The queue has now "+mine.numElements()+" elements.");
        mine.print();

    } // main

}
