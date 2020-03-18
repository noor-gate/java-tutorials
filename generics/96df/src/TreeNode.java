public abstract class TreeNode<E> {
    private E key;

    public abstract int getNumberOfChildren();

    public abstract TreeNode<E> getChild(int childIndex);

    public abstract void setChild(int childIndex, TreeNode<E> child);

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }
}
