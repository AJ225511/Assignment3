package wiese.aj;

public class Square implements Shape {
    private final double a;

    public Square() {
        this(5);
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

}