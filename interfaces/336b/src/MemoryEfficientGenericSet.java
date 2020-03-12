import java.util.ArrayList;

import java.util.List;

public class MemoryEfficientGenericSet<T> implements GenericSet<T> {

    private List<T> integerSet;

    public MemoryEfficientGenericSet() {
        integerSet = new ArrayList<>();
    }

    @Override
    public void add(T x) {
        if (integerSet.contains(x)) {
            return;
        }
        integerSet.add(x);
    }

    @Override
    public boolean remove(T x) {
        return integerSet.remove(x);
    }

    @Override
    public boolean isEmpty() {
        return integerSet.isEmpty();
    }

    @Override
    public boolean contains(T x) {
        return integerSet.contains(x);
    }

}
