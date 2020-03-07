public class BitSet8 implements BitSet {

    private byte bitSet;

    public BitSet8() {
        bitSet = 0;
    }

    @Override
    public void add(int x) {
        if (x >= 0 && x < maxStorableValue()) {
            bitSet |= ((byte) 1 << (byte) x);
        } else {
            throw new IllegalArgumentException("Number is not in range");
        }
    }

    @Override
    public void remove(int x) {
        if (this.contains(x)) {
            bitSet &= ~((byte) 1 << (byte) x);
        }
    }

    @Override
    public boolean contains(int x) {
        return bitSet == (bitSet | ((byte) 1 << (byte) x));
    }

    @Override
    public void intersectWith(BitSet s) {
        if (s instanceof BitSet8) {
            bitSet &= ((BitSet8) s).bitSet;
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
        return Byte.SIZE;
    }

    @Override
    public String toString() {
        return Byte.toString(bitSet);
    }
}
