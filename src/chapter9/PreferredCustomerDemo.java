package chapter9;

public class PreferredCustomerDemo {
    public static void main(String[] args) {
        demonstration();
    }
    public static void demonstration() {
        PreferredCustomer preferredCustomer =
                new PreferredCustomer();

        preferredCustomer.setPurchasesTotal(249.50 + 500.00);
        preferredCustomer.setDiscountPercentage();
        System.out.println(preferredCustomer.getDiscountPercentage());
    }
}
