package Chapter3;

import java.lang.Math.*;

public class Circle {
    private final double PI = Math.PI;
    private double radius;

    public double getCircumference() {
        return ( getDiameter() * PI * 2 );
    }
    public double getArea() {
        return ( (getDiameter()) * (PI) );
    }
    public double getDiameter() {
        return Math.pow(radius, 2);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}


