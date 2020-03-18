public class LeafNode<E> extends TreeNode<E> {

    @Override
    public int getNumberOfChildren() {
        return 0;
    }

    @Override
    public TreeNode<E> getChild(int childIndex) {
        assert false;
        return null;
    }

    @Override
    public void setChild(int childIndex, TreeNode<E> child) {
        assert false;
    }
}
