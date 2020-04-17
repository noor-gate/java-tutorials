import java.util.ArrayList;

import java.util.List;

public class MemoryEfficientGenericSet<T> implements GenericSet<T> {

    private List<T> genericSet;

    public MemoryEfficientGenericSet() {
        genericSet = new ArrayList<>();
    }

    @Override
    public void add(T x) {
        if (genericSet.contains(x)) {
            return;
        }
        genericSet.add(x);
    }

    @Override
    public boolean remove(T x) {
        return genericSet.remove(x);
    }

    @Override
    public boolean isEmpty() {
        return genericSet.isEmpty();
    }

    @Override
    public boolean contains(T x) {
        return genericSet.contains(x);
    }

}
