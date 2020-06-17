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
        if (shift == 0 || shift == 1) {
            this.shift = shift;
        } else {
            System.out.println("invalid input for shift. " +
                    "shift field not set.");
        }
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
