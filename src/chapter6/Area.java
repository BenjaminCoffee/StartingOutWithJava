package chapter6;

public class Area {

    // circle
    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // rectangle
    public static double area(int length, int width) {
        return length * width;
    }

    // cylinder
    public static double area(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
