package edx;

import org.omg.CORBA.NO_IMPLEMENT;

public class MyLinkedList <E extends Comparable<E>>{
    // Notice that stating E extends Comparable<E> is needed, as we should use
    // compareTo for inserting in a sorted way
    private Node<E> first;

    public MyLinkedList(){
        this.first = null;
    }

    /*
     * Insertion at the beginning
     * Change this method to insert the values in a sorted way
     */


    /*
     * Extraction of the first node
     */
        // Notice that stating E extends Comparable<E> is needed, as we should use
        // compareTo for inserting in a sorted way



        /*
         * Insertion at the beginning
         * Change this method to insert the values in a sorted way
         */

        public void insertEnd(E info){
            //Implement this method
            Node<E> current = first;
            if (first == null) { first = new Node <E>(info); return;}
            while (current.getNext() != null){
                current = current.getNext();
            }
            Node<E> newNode = new Node <E>(info);
            current.setNext(newNode);



        }
    /*add the first node as head

     * if the newNode is greater than first node we return postive else negetive
     * if the info of the newNode is negative in comparable of the first NodeUdemy:
     * we assing the next attribute  in newNode to point to the first node
     * then we assign the newNode to the first
     * we create new value to trace the List we call it temp
     * then we create while loop with two conditions :
     *if the attribute next in temp has value
     * if the info of the newNode is positive in comparable of the temp NodeUdemy (the trace variable)
     *we update the value of the tracing variable
     *we assign the  newNode to null
     * we assign the attribute next in trace value to the newNode
     */
        public  void insertAtPos(E info , int x){
            Node <E> trace = first;
            Node <E> prev = null;
            Node hold;
            if (trace == null ){
                System.out.println("Error");
                return;
            }
           for  (int i=0; i <= x -1 && trace.getNext() != null; i++){
                prev  =trace;
                trace = trace.getNext();
            }

            Node <E> newNode = new Node<>(info);
            newNode.setNext(trace);
            prev.setNext(newNode);


        }
        public void insert(E info){
            Node <E> newNode = new Node<E> (info);
//            newNode.setNext(first);
            if (first == null ){
                first = newNode;
            }
            else if (first.getNext() == null||newNode.getInfo().compareTo(first.getInfo()) < 0){
                if (newNode.getInfo().compareTo(first.getInfo())< 0 ){
                    newNode.setNext(first);
                    first = newNode;
                }
                else{
                    first.setNext(newNode);
                }
            }
            else {
                Node<E> temp = first;
                while(temp.getNext() != null && newNode.getInfo().compareTo(temp.getNext().getInfo()) > 0){
                    temp =temp.getNext();
                }
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }




        }

        /*
         * Extraction of the first node
         */
        /*
        * we create trace variable to keep track for the list
        * we create another variable to get the previous node of the node we want to delete
         * if the node we want to delete is the head we simply put the next node in the list to be the head
         * otherwise create while loop to loop through the list with two conditions:
            *to make sure that our attribute next for the trace variable is not null
             * and to search for the key we want to delete in our list
              * inside the while loop body:
                   * we will update the value of our previous node of the node we want to delete
                    * and we update the value of the tracing variable to be the next node
         *we move the pointer from prev variable to the next element of tracing variable*/
        public void remove(E e){

            Node<E> temp = first;
            Node<E> prev= null;
            if (temp.getInfo() == e && temp != null){
                first = temp.getNext();
                return;
            }
            while (temp.getNext() != null && temp.getInfo() != e){
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());

        }
        public int get(E y ){
            Node <E> x = first ;
            int count = 0 ;
            while (x.getNext() != null && x.getInfo() != y){
                x = x.getNext();
                count++;
            }
            return count;
        }
        /*
         * Print all list
         */
        public void print(){
            Node<E> current = first;

            while (current != null){
                System.out.print(current.getInfo() + " ");
                current = current.getNext();
            }
            System.out.println();
        }

    public static void main(String args[]){
        // Create a linked list using MyLinkedList<Integer>
        MyLinkedList<Integer> mine = new MyLinkedList<Integer>();
        // Insert 10 ints
       mine.insert(0);
       mine.insert(1);
       mine.insert(2);
       mine.insert(9);

        mine.insertAtPos(5,2);
        mine.insertEnd(5);


        //Print the whole list
        mine.print();

    }



    /*
     * Print all list
     */

}
