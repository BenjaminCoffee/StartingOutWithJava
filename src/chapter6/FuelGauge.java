package chapter6;

public class FuelGauge {
    private int gallons;

    public FuelGauge(int gallons) {
        this.gallons = gallons;
    }

    public void decrementGallonsByOne() {
        if (gallons >= 1) {
            gallons--;
        }
        else System.out.println("The tank is empty.");
    }
    public void incrementGallonsByOne() {
        if (gallons <= 14) {
            gallons++;
        }
        else System.out.println("The tank is full.");
    }
    public int getGallons() {
        return gallons;
    }
}
