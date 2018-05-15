package Binary_Search_Tree;

public  class TreeNode <E>{
    protected TreeNode <E> left ;
    protected TreeNode <E> right ;
    private E data ;
    private  TreeNode <E> parent ;
    public TreeNode(TreeNode<E> left, TreeNode<E> right, E data) {
        this.left = null;
        this.right = null;
        this.data = data;
        this.parent = parent;
    }

    public TreeNode(E data, TreeNode<E> parent) {
        this.data = data;
        this.parent = parent;
    }


    public TreeNode<E> getLeft() {
        return left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public E getData() {
        return data;
    }

    public TreeNode<E> getParent() {
        return parent;
    }
    public TreeNode<E> setLeft(E value, TreeNode<E> x){
        this.left = new TreeNode<E>(value, this);
        return this.left;
    }
    public TreeNode<E> setRight(E value, TreeNode<E> x){
        this.right = new TreeNode<E>(value, this);
        return this.right;
    }

    public void setData(E data) {
        this.data = data;
    }
}

