import java.util.Iterator;

public class MemoryEfficientIntSetIterator implements IntSetIterator{

    private Iterator<Integer> it;

    public MemoryEfficientIntSetIterator(Iterator<Integer> it) {
        this.it = it;
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public int next() {
        return it.next();
    }
}
