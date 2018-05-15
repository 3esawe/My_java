package Array_Stacks;


public class Array_Stack implements Stacks{
    public static final int DEFAULT_CAPACITY=1000;
    private int capacity;
    static private Object data[];
    static private int top=-1;

    public Array_Stack(int capacity) {
        this.capacity=capacity;
        data=new Object[capacity];
    }

    public Array_Stack() {
        this(DEFAULT_CAPACITY);
    }
    /*@method it checks whether the stack isEmpty*/
    public boolean isEmpty(){
        return (top<0);
    }
    /*@method it returns the size*/

    public int size(){
        return (top+1);
    }
    /*@method it returns the top element without removing it*/
    public Object top() {
        if (isEmpty())
            System.out.println("Stack is empty");
        return data[top];
    }

    /*@method returns the top element and removes it from stack*/
    public Object pop()  {
        if (isEmpty())
            System.out.println("Stack is empty");
        Object o = data[top];
        data[top] = null;
        top--;
        return o;
    }
    /*@param we the object we want to add
    * @method we increase the value top by 1 and assing the value of our object to that index*/
    public void push(Object o) {
        if (size() == capacity)
            System.out.println("Stack is full");
        top++;
        data[top]=o;
    }

    /*
     * Implement this method
     * If the Object o is within the Stack,
     * Returns the 1-distance to the top of the position
     * where it is stored (1 -> at the top, 2 -> top -1, etc.)
     * If the object is not found at the Stack
     * It returns -1
     * Use equals to compare both objects
     */
    public int search(Object o){

        for (int i =0 ; i <data.length; i++){
            if (data[i].equals(o)){
                return top-i+1;
            }

        }
        return -1;
    }
    public void print(){
        for (int i =0; i < size(); i++){
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        Stacks stacks = new Array_Stack(500);
        stacks.push("omar");
        stacks.push("ali");

        System.out.println(stacks.search("omar"));

    }
}
