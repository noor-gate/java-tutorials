import java.util.Iterator;

public abstract class AbstractIntSet implements IntSet {

    @Override
    public boolean contains(IntSet other) {
        for (IntSetIterator it = other.iterator(); it.hasNext();) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addAll(IntSet other) {
        for (IntSetIterator it = other.iterator(); it.hasNext();) {
            add(it.next());
        }
    }

    @Override
    public void removeAll(IntSet other) {
        for (IntSetIterator it = other.iterator(); it.hasNext();) {
            remove(it.next());
        }
    }
}
