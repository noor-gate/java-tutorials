public class Demo {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet8();
        BitSet bitSet2 = new BitSet64();

        System.out.println(bitSet1);

        bitSet1.add(1);
        bitSet1.add(2);
        bitSet1.add(3);

        System.out.println(bitSet1);

        bitSet2.add(2);
        bitSet2.add(3);

        bitSet1.intersectWith(bitSet2);
        System.out.println(bitSet1);
    }
}
