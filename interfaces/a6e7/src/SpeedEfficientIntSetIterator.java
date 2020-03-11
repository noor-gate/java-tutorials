import java.util.Iterator;

public class SpeedEfficientIntSetIterator implements IntSetIterator {

    private Iterator<Integer> iterator;

    public SpeedEfficientIntSetIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public int next() {
        return iterator.next();
    }
}
