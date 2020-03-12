public interface GenericSet<T> {
    public void add(T x);

    public boolean remove(T x);

    public boolean isEmpty();

    public boolean contains(T x);

    public default void addAll(T[] items) {
        for (T t : items) {
            add(t);
        }
    }

    public default GenericSet<T> asUnmodifiableSet() {
        return new GenericSet<T>() {
            @Override
            public void add(T x) {
                throw new UnsupportedOperationException("Attempt to add to an unmodifiable set");
            }

            @Override
            public boolean remove(T x) {
                throw new UnsupportedOperationException("Attempt to remove from an unmodifiable set");
            }

            @Override
            public boolean isEmpty() {
                return GenericSet.this.isEmpty();
            }

            @Override
            public boolean contains(T x) {
                return GenericSet.this.contains(x);
            }
        };
    }
}
