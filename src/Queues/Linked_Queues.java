package Queues;
class Node<E> {
    private E info;
    private Node<E> next;

    public Node() {
        info = null;
        next = null;
    }

    public Node(E info) {
        setInfo(info);
    }

    public Node(E info, Node<E> next) {
        setInfo(info);
        setNext(next);
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
public class Linked_Queues <E> {
   private Node<E> top ;
   private Node<E> tail ;
   private int size;

    public Linked_Queues() {
        this.top = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return top ==null;
    }

    public int getSize() {
        return size;
    }
    /*@method we return the first element entered  the queue*/
    public E front() {
        if (isEmpty()){
            System.out.println("Empty queue");
        }
        return top.getInfo();
    }
    /*@method we assign tmp value to our first element entered the queue
    * then we change it reference to it's next element
    * we decrement the size of our queue
    * we return it*/
    public E dequeue (){
        E tmp = top.getInfo();

        if (isEmpty()){
            System.out.println("Empty queue");
        }
        top = top.getNext();
        size --;
        if (isEmpty()){
            tail =null;
        }
        return tmp;
    }
    /*@param we enter value in the queue
    * we create a new node and assign the value of @param to it
    * and we put it's next refrence to null
    * the we put the pointer of tail to next
    * then we change the tail reference to the new node */
    public void queue (E data){
        Node<E> n = new Node<E>(data,null);
        if (isEmpty())top=n;
        else tail.setNext(n);
        tail = n;
        size++;
    }

    public static void main(String[] args) {
        Linked_Queues <Integer> q  = new Linked_Queues<Integer>();
        for (int i = 0 ; i < 10; i++){
            q.queue(i);
        }

        System.out.println("Size: " + q.getSize());

        Integer e = q.front();
        System.out.println("Size: " + q.getSize());
        System.out.println(e);

        e = q.dequeue();
        e = q.dequeue();
        System.out.println("Size: " + q.getSize());

        e = q.dequeue();
        e = q.dequeue();
        e = q.dequeue();
        System.out.println("Size: " + q.getSize() + " isEmpty: " + q.isEmpty());


    }
}
