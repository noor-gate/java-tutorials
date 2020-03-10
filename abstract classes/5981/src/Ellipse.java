public class Ellipse extends Shape {
    private int semimajor;
    private int semiminor;

    public Ellipse(int semimajor, int semiminor) {
        this.semimajor = semimajor;
        this.semiminor = semiminor;
    }

    public void setSemimajor(int semimajor) {
        this.semimajor = semimajor;
    }

    public void setSemiminor(int semiminor) {
        this.semiminor = semiminor;
    }

    public int getSemimajor() {
        return semimajor;
    }

    public int getSemiminor() {
        return semiminor;
    }

    @Override
    public boolean isCircle() {
        return semimajor == semiminor;
    }

    @Override
    public boolean isSquare() {
        return false;
    }
}
