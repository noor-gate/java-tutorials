public class Rectangle {
    private final Point topLeft;
    private final int width;
    private final int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return new Point(topLeft.getCoordX() + width, topLeft.getCoordY() - height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int area() {
        return width * height;
    }

    public boolean contains(Rectangle r2) {
        return
                getTopLeft().getCoordX() <= r2.getTopLeft().getCoordX()
                        && getTopLeft().getCoordY() <= r2.getTopLeft().getCoordY()
                        && getBottomRight().getCoordX() >= r2.getBottomRight().getCoordX()
                        && getBottomRight().getCoordY() >= r2.getBottomRight().getCoordY();
    }

    public String toString() {
        return "(top-left = " + topLeft + ", width = " + width
                + ", height = " + height + ")";
    }

}
