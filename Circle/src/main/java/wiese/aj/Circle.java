package wiese.aj;

import java.awt.*;

public class Circle implements Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(6);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {

        return pi * Math.pow(radius, 2);
    }

}
