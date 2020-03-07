public class ColouredPoint extends Point {

    private String colour;

    public ColouredPoint(double x, double y, double z, String colour) {
        super(x, y, z);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + colour;
    }
}
