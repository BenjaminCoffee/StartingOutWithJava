package Chapter4;

public class ShippingChargesDriver {
    public static void main(String[] args) {
        shippingChargesDemo();
    }
    public static void shippingChargesDemo() {
        ShippingCharges item0 = new ShippingCharges();
        item0.inputWeight();
        item0.inputDistance();
        System.out.println(item0.statement());
    }
}
