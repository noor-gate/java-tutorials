import java.util.ArrayList;

import java.util.List;

public class MemoryEfficientIntSet extends AbstractIntSet {

    private List<Integer> integerSet;

    public MemoryEfficientIntSet() {
        integerSet = new ArrayList<>();
    }

    @Override
    public void add(int x) {
        if (integerSet.contains(x)) {
            return;
        }
        integerSet.add(x);
    }

    @Override
    public boolean remove(int x) {
        return integerSet.remove(Integer.valueOf(x));
    }

    @Override
    public boolean isEmpty() {
        return integerSet.isEmpty();
    }

    @Override
    public boolean contains(int x) {
        return integerSet.contains(x);
    }

    public IntSetIterator iterator() {
        return new MemoryEfficientIntSetIterator(integerSet.iterator());
    }

}
