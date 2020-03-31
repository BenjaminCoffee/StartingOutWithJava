package chapter6;

public class Geometry {
    public static double areaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double areaRectangle(double length, double width) {
        if (length > 0 && width > 0) {
            return length * width;
        }
        else {
            System.out.println("negative values may not be added.");
            return 0;
        }

    }

    public static double areaTriangle(double base, double height) {
        if(base > 0 && height > 0) {
            return base * height * 3 * .05;
        }
        else {
            System.out.println("negative values may not be added.");
            return 0;
        }
    }

}
