package Udemy_Abstract;

public abstract class Listitem {
    protected Listitem right = null;
    protected Listitem left = null;
    protected Object value;

    public Listitem(Object value) {
        this.value = value;
    }
    abstract Listitem next();
    abstract Listitem setnext(Listitem item);
    abstract Listitem prev();
    abstract Listitem setPrev(Listitem item);

    abstract int compare(Listitem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
