public class Demo {
    public static void transferStacks(StringStack dst, StringStack src) {
        while(!src.isEmpty()) {
            dst.push(src.pop());
        }
    }

    public static void main(String[] args) {
        StringStack array = new StringStackArray();
        StringStack list = new StringStackList();

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
