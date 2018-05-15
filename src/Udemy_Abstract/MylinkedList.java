package Udemy_Abstract;

public class MylinkedList implements NodeList {
    private Listitem root = null;

    public MylinkedList(Listitem root) {
        this.root = root;
    }
    @Override
    public Listitem getrRoot() {
        return null;
    }

    @Override
    public boolean addItem(Listitem listitem) {
        if (this.root == null){
            root = listitem;
            return true;
        }

        Listitem temp = root;
        while(temp != null){
            int com = temp.compare(listitem);
            if ( com < 0){

                if (temp.next() != null){
                    temp = temp.next();
                }

                 else {
                    temp.setnext(listitem);
                    listitem.setPrev(temp);
                    return true;
                }
            }

            else if (com > 0 ){
                if (temp.prev() != null){
                    temp.prev().setPrev(listitem);
                    listitem.setPrev(temp.prev());
                    listitem.setnext(temp);
                    temp.setPrev(listitem);
                }
            }
            else {
                listitem.setnext(root);
                this.root.setPrev(listitem);
                this.root = listitem;
            }
            return true;
        }
        return false;



    }

    @Override
    public boolean removeItem(Listitem listitem) {
        return false;
    }

    @Override
    public void print(Listitem root) {
        if(root == null){
            return;
        }
        else {
            while (root  != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
