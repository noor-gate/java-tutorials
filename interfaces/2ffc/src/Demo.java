public class Demo {
    public static <T> void transferStacks(GenericStack<T> dst, GenericStack<T> src) {
        while(!src.isEmpty()) {
            dst.push(src.pop());
        }
    }

    public static void main(String[] args) {
        GenericStack<String> array = new GenericStackArray<>();
        GenericStack<String> list = new GenericStackList<>();

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
