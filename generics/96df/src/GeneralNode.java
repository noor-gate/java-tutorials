public class GeneralNode<E> extends TreeNode<E> {

    private TreeNode<E>[] children;

    @SuppressWarnings("unchecked")
    public GeneralNode(int numberOfChildren) {
        children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
    }

    @Override
    public int getNumberOfChildren() {
        return children.length;
    }

    @Override
    public TreeNode<E> getChild(int childIndex) {
        return children[childIndex];
    }

    @Override
    public void setChild(int childIndex, TreeNode<E> child) {
        children[childIndex] = child;
    }
}
