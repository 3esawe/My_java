package PQueues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;

/*
    booleanadd(E element): This method inserts the specified element into this priority queue.

    public remove(): This method removes a single instance of the specified element from this queue, if it is present

    public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.

    public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

    iterator(): Returns an iterator over the elements in this queue.

    booleancontains(Object o): This method returns true if this queue contains the specified element
*/
public class PQueues {
    public static void main(String[] args) {
     
        PriorityQueue<String> x = new PriorityQueue<>();
        x.add("Azi");
        x.add("Ammar");

        Iterator it = x.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
