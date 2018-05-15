package Udemy_Abstract;

public class NodeUdemy extends Listitem{
    public NodeUdemy(Object value) {
        super(value);
    }

    @Override
    Listitem next() {
        return this.right;
    }

    @Override
    Listitem setnext(Listitem item) {
        this.right =item;
        return this.right;
    }

    @Override
    Listitem prev() {
        return this.left;
    }

    @Override
    Listitem setPrev(Listitem item) {
        this.left =item;
        return this.left;
    }

    @Override
    int compare(Listitem item) {
        if(item !=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else{
            return -1;
        }
    }
}
