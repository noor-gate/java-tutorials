public class Demo {

    public static void main(String[] args) {
        GenericSet<Integer> mem = new MemoryEfficientGenericSet<>();
        GenericSet<Integer> spid = new SpeedEfficientGenericSet<>();

        Integer[] arrayOne = {1, 2, 3, 4};
        Integer[] arrayTwo = {5, 6, 7, 8};

        mem.addAll(arrayOne);
        mem.addAll(arrayTwo);

        spid.addAll(arrayOne);
        spid.addAll(arrayTwo);


    }
}
