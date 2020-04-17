public class Demo {
    public static void transferStacks(GenericStack<String> dst, GenericStack<String> src) {
        while(!src.isEmpty()) {
            dst.push(src.pop());
        }
    }

    public static void main(String[] args) {
        GenericStack<String> array = new GenericStackArray<String>();
        GenericStack<String> list = new GenericStackList<String>();

        array.push("hello");
        array.push("world");
        array.push("!");

        transferStacks(list, array);

        assert array.isEmpty();

        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }
    }
}
