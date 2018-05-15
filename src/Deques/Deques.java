package Deques;
class DNode {

    DNode next, prev;
    Object val;

    public DNode() {

        this.next = null;
        this.prev = null;
        this.val = null;
    }

    public DNode(Object val, DNode first, DNode last) {

        this.next = first;
        this.prev = last;
        this.val = val;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

}

public class Deques {
    DNode head, tail;
    int size;

    public Deques() {
        head = new DNode();
        tail = new DNode();
        head.setNext(tail);
        tail.setPrev(head);
        size = 0;
    }
    /*@param we add our element to the deque
    * we create a variable to trace the head
    * we create new node
    * we assign it's value to @param
    * we put it's next to head
    * we change pervious pointer of head to be the new node
    * we update the reference of our head to be the new node (as the head is represented by the first element)*/
    public void insertFirst(Object obj) {
        DNode h = head;
        DNode node = new DNode();
        node.setVal(obj);
        node.setNext(h);
        h.setPrev(node);
        head = node;
        if (size == 0)
            tail = node;
        size++;

    }
    /*@param we add our element to the deque
    * we create new node
    * we assign it's value to @param
    * we set it's prev pointer to the tail
    * we set the tail next pointer to our new node
    * the we update the tail reference to be the last element */
    public void insertLast(Object obj) {
        DNode t = tail;
        DNode node = new DNode();
        node.setVal(obj);
        node.setPrev(t);
        t.setNext(node);
        tail = node;
        if (size == 0)
            head = node;
        size++;
    }
    /*we retrieve the value of the first element to aux variable
    * the we update the reference of our head varible to be the next element and the java garabge collector will take care of the element we removed
     * we decrement the size*/
    public Object removeFirst() {
        if (head == null)
            return null;
        Object val = head.getVal();
        head = head.getNext();
        size--;
        return val;
    }
    /*we retrieve the last element and store it in aux variable
    * we update the reference of our tail to be the prev element and the java garabge collector will take care of the element we removed
    * we decrement the size*/
    public Object removeLast() {
        if (tail == null)
            return null;
        Object val = tail.getVal();
        tail = tail.getPrev();
        size--;
        return val;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String s = "head [";
        DNode aux = head;
        for (int i = 0; i < size; i++) {
            s += aux.getVal();
            if (aux == tail) {
                break;
            }
            s += "-";
            aux = aux.getNext();
        }
        return s + "] tail";
    }
}
