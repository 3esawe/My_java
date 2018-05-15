package Queues;

public interface Queues <E> {
    public E dequeue ();
    public void queue(E data);
    public int size ();
    public E Front();
    public boolean isEmpty();
}
