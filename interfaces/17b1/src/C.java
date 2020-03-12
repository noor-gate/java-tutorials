import java.io.IOException;

public class C implements K {
    @Override
    public void baz() {

    }

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

    public int foobarOther() throws IOException {
        throw new IOException();
    }

    public int foobar() {
        return 0;
    }

    protected int foobarOther(int x) {
        return x;
    }

    public int foobar(int x) {
        return x;
    }

}