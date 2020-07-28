package chapter9;

public class PreferredCustomer extends Customer {

    public static void main(String[] args) {

    }
    private double purchasesTotal;
    private double discountPercentage;

    public void setDiscountPercentage() {
        discountPercentage = calculateDiscountPercentage();
    }

    public double calculateDiscountPercentage() {
        double discountPercentage;

        if (purchasesTotal >= 2000) {
            discountPercentage = 0.1;
        } else if (purchasesTotal >= 1500) {
            discountPercentage = 0.7;
        } else if (purchasesTotal >= 1000) {
            discountPercentage = 0.6;
        } else if (purchasesTotal >= 500) {
            discountPercentage = 0.5;
        } else discountPercentage = 0;

        return discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setPurchasesTotal(double purchasesTotal) {
        this.purchasesTotal = purchasesTotal;
    }
}
