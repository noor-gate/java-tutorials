public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2) + Math.pow(z - p.getZ(), 2));
    }

    public Point getOrigin() {
        return new Point(0, 0, 0);
    }

    public double distanceFromOrigin() {
        return this.distanceTo(getOrigin());
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return x == point.x && y == point.y && z == point.z && hashCode() == point.hashCode();
    }

    @Override
    public int hashCode() {
        return (int) (Math.pow(x, y) + Math.pow(y, z));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
