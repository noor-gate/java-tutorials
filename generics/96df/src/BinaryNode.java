public class BinaryNode<E> extends TreeNode<E> {

    private TreeNode<E> left;
    private TreeNode<E> right;

    @Override
    public int getNumberOfChildren() {
        return 2;
    }

    @Override
    public TreeNode<E> getChild(int childIndex) {
        if (childIndex == 0) {
            return left;
        }
        return right;
    }

    @Override
    public void setChild(int childIndex, TreeNode<E> child) {
        if (childIndex == 0) {
            left = child;
        } else {
            right = child;
        }
    }
}
