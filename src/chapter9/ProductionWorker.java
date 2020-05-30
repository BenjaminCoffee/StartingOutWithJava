package chapter9;

public class ProductionWorker extends Employee {
    private int shift;
    private double payRate;

    @Override
    public String toString() {
        return "ProductionWorker{" +
                "shift=" + shift +
                ", payRate=" + payRate +
                "} " + super.toString();
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
