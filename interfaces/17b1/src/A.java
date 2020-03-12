public class A implements I {
    @Override
    public int foo() {
        return 0;
    }

    @Override
    public int foo(int x) {
        return 0;
    }

    @Override
    public int bar(int x) {
        return 0;
    }

    public int foobar() {
        return 42;
    }

    public void foobarOther(int x) {
        System.out.println(x);
    }

    public int foobar(int x) {
        return x;
    }
}