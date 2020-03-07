public interface BitSet {
    void add(int x);
    void remove(int x);
    boolean contains(int x);
    void intersectWith(BitSet s);
    int maxStorableValue();
}
