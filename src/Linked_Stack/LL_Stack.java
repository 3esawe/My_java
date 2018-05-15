package Linked_Stack;

public class LL_Stack <E> implements Stacks<E>{
    private Node<E> top;
    private int size;

    @Override
    /*@method we create a new Node we set it's next attribute to the top then we change the refrence of top to the new Node
    * then we increase the size*/
    public void push(E d) {
        Node <E> n = new Node<>(d ,top);
        top =n;
        size++;
    }

    @Override
    /*@method we create a new variable to not lose the element we want to return
    * we change the pointer of top to the next element and decrease the size*/
    public E pop() {
        E data ;
        data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    @Override
    /*@method returns the firsts element in the linked list*/
    public E top() {
        if (isEmpty()) System.out.println("the Stack is Empty");
        return top.getData() ;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size ==0);
    }

    @Override
    public void print(LL_Stack<Integer> p) {
        Integer element ;
        if (!isEmpty() ){
            element = p.pop();
            System.out.println(element);
            print(p);
            // Back to the recursivity.
            p.push(element);
        }
    }

    /*     * Implement this method
     * If the Object o is within the Stack,
     * Returns the 1-distance to the top of the position
     * where it is stored (1 -> at the top, 2 -> top -1, etc.)
            * If the object is not found at the Stack
     * It returns -1
            * Use compareTo to compare both elements instead of equals
     * Compare how the program behaves using equals or using compareTo
     * This is a possible implementation.
     */
    @Override
    public int search(E o) {
        int result = -1;
        Node curr = top;
        for (int i=0; i <= size && curr.getNext() != null; i++){
            if (curr.getData().equals(o)){
                result = i+1;
            }
            curr = curr.getNext();
        }
        return result;
    }

    public static void main(String[] args) {
        LL_Stack<Integer> p = new LL_Stack<>();

        p.push(1);
        p.push(5);
        p.print(p);
    }
}
