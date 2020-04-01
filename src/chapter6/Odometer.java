package chapter6;

public class Odometer {
    private int miles;

    public Odometer(int miles) {
        this.miles = miles;
    }

    public void incrementMilesByOne() {
        if (miles == 999999) {
            miles = 0;
        }
        else miles++;
    }

    public int getMileage() {
        return miles;
    }
}
