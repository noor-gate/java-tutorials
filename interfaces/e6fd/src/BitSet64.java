public class BitSet64 implements BitSet {

    private long bitSet;

    public BitSet64() {
        bitSet = 0;
    }

    @Override
    public void add(int x) {
        if (x >= 0 && x < maxStorableValue()) {
            bitSet |= ((long) 1 << (long) x);
        } else {
            throw new IllegalArgumentException("Number is not in range");
        }
    }

    @Override
    public void remove(int x) {
        if (this.contains(x)) {
            bitSet &= ~((long) 1 << (long) x);
        } else {
            System.out.println("This number is not in the set");
        }
    }

    @Override
    public boolean contains(int x) {
        return bitSet == (bitSet | ((long) 1 << (long) x));
    }

    @Override
    public void intersectWith(BitSet s) {
        if (s instanceof BitSet64) {
            bitSet &= ((BitSet64) s).bitSet;
        } else {
            for (int i = 0; i <= maxStorableValue(); i++) {
                if (!s.contains(i)) {
                    this.remove(i);
                }
            }
        }
    }

    @Override
    public int maxStorableValue() {
        return Long.SIZE;
    }

    @Override
    public String toString() {
        return Long.toString(bitSet);
    }
}
