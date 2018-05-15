package Binary_Search_Tree;

public class BST<E extends Comparable<? super E>> {
    TreeNode<E> root;


    public boolean addElement(E value) {
        if (root == null) {
            root = new TreeNode<E>(null, null, value);
        }
        TreeNode<E> curr = root;
        int x = value.compareTo(curr.getData());
        while (x > 0 && curr.getRight() != null || x < 0 && curr.getLeft() != null) {
            if (x > 0) {
                curr = curr.getRight();
            } else curr = curr.getLeft();
            x = value.compareTo(curr.getData());
        }
        if (x > 0) {
            curr.setRight(value, curr);
            return true;
        } else if (x < 0) {
            curr.setLeft(value, curr);
            return true;
        }
        return false;
    }

    public boolean search(E data) {
        TreeNode<E> curr = root;
        int comp = data.compareTo(curr.getData());
        while (curr != null) {
            if (comp < 0) {
                curr = curr.getLeft();
            } else if (comp > 0) {
                curr = curr.getRight();
            }
            else {
                return true;
            }
        }
        System.out.println(data + " was not in the Tree");
        return false;


    }

    public void preorder() {
        preorder(root);
    }

    public void preorder(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData());
            ;
            preorder(node.getLeft());
            preorder(node.getRight());
        }

    }

    public int count() {
        return count(root);
    }

    public int count(TreeNode root) {
        if (root == null)

            return 0;

        else

        {

            int l = 1;

            l += count(root.getLeft());

            l += count(root.getRight());

            return l;

        }
    }

    public boolean isEmpty() {
        return (root == null);
    }


    public void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    public void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getData());
            inorderRec(root.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    public void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.getLeft());
            System.out.println(node.getData());
            postorder(node.getRight());
        }
    }

    public void getKeys() {
        getKeys(root);
    }


    /*@param the parameter for the node we get the key for
    * @method first we print out the root key
    * @recursion we get the (left and right) node of each node recursively [we start from the left branch until no node]
    * @recursion we get the ((left and right) node of each node recursively [second start from the right branch until no node]
    * debug if i forget
    */

    public void getKeys(TreeNode root) {
        if( root != null){
            int toatl = 0;

            char[] z = root.getData().toString().toCharArray();


            toatl = 0;
            for (char w : z) {
                toatl += w;
            }


            System.out.println(root.getData() + " Key is: " + toatl);
            getKeys(root.getLeft());
            getKeys(root.getRight());
        }

    }


    public static void main(String[] args) {
        BST<String> x = new BST<String>();
        x.addElement("Omar");
        x.addElement("Dad");
        x.addElement("bahi");
        x.addElement("Ali");
        x.addElement("Yaser");
        x.addElement("Essa");
        x.addElement("Rashed");
        x.addElement("Fatemah");
        x.addElement("xor");
        x.addElement("Zaher");
        x.inorder();
        x.getKeys();

    }


}

