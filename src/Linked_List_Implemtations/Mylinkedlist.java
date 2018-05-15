package Linked_List_Implemtations;

public class Mylinkedlist <E> implements methods {
    private MyNode head;
    private MyNode tail;
    private int size;



    public int getSize() {
        return size;
    }

    public void InsertAtFront(Object data){
        MyNode<E> x = new MyNode(data);
        if (tail == null ){
            tail =x;
        }
        x.setNext(head);
        if(head != null ){
            head.setPrev(x);
        }
        head =x ;
        size++;

    }
    public int get (Object data){
        MyNode tmp = head;
        for (int i =1; i <= size ; i++){
            if(tmp.getData() == data){
                return i;
            }
            else {
                tmp = tmp.getNext();
            }
        }
        return -1;
    }
    public void InsertAtEnd(Object data){
        MyNode<E> x = new MyNode(data);
        if ( head == null){
            x.setPrev(null);
            head = x;
            return;
        }
        x.setNext(null);
        x.setPrev(tail);
        tail = x;
        MyNode tmp = head;
        while (tmp.getNext() != null){
            tmp = tmp.getNext();
        }
            tmp.setNext(x);
            x.setPrev(tmp);
            size++;

    }
    public void InsertAtPos(int index, Object x){
        try{
            if (index > size){
                throw new Exception("index is greater than the size");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        MyNode tmp = head;
        for (int i=1; i <= size; i++){
            if ( 0 == index){
                InsertAtFront(x);
                return;
            }
            else if (i == index){
                MyNode <Object> newNode = new MyNode<Object>(x);
                newNode.setNext(tmp.getNext());
                tmp.setNext(newNode);
                if(newNode.getNext() != null)
                    newNode.getNext().setPrev(newNode);
                newNode.setPrev(tmp);
            }

            else {
                tmp =tmp.getNext();
            }
        }




    }
    public void delete (int index){
        MyNode tmp =head;
        for (int i=0; i <= index;i++){
            if (i == index){
                tmp.getPrev().setNext(tmp.getNext());
                tmp.getNext().setPrev(tmp.getPrev());
            }
            else {
                tmp = tmp.getNext();
            }
        }

    }

    public void trevarse(){
        MyNode tmp = head;
        MyNode last = null;
        if (tmp == null){
            return;
        }
        else {
            while (tmp != null){
                System.out.println(tmp.getData());
                last = tmp;
                tmp = tmp.getNext();
            }
        }

    }
    public void trevarseBack(){
        MyNode tmp = tail;

        if (tmp == null){
            return;
        }
        else {
            while (tmp != null){
                System.out.println(tmp.getData());
                tmp = tmp.getPrev();
            }
        }
    }
}
