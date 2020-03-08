import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Point first = new Point(1, 1, 1);
        Point second = new Point(2, 2, 2);
        Point third = new Point(1, 1, 1);

        Point fourth = new ColouredPoint(2, 2, 2, "red");
        Point fifth = new ColouredPoint(2, 2, 2, "blue");

        System.out.println(first.equals(third));
        System.out.println(fourth.equals(fifth));

        Set<Point> pointSet = new HashSet<>();
        pointSet.add(first);
        System.out.println(pointSet.contains(third));
    }
}
