public class Demo {
    public static void main(String[] args) {
        Point first = new Point(1, 1, 1);

        System.out.println(first.toString());
        System.out.println(first.distanceFromOrigin());

        Point second = new ColouredPoint(2, 2, 2, "red");

        System.out.println(second.toString());
    }
}
