package chapter6;

import java.util.Objects;

public class LandTract {
    private double length;
    private double width;

    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }

    public boolean isAreaEqual(LandTract landTract) {
        if (landTract.getArea() == this.getArea()) {
            return true;
        }
        return false;
    }

    public boolean equals(LandTract landTract) {
        if (landTract.length == this.length
                &&
                landTract.width == this.width) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "LandTract:\n" +
                " length = " + length + "\n" +
                " width = " + width;

    }
}
