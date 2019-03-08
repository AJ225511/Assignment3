package wiese.aj;

public class Rectangle implements Shape {

    private final double width, length;

    public Rectangle() {
        this(21,22);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

}
