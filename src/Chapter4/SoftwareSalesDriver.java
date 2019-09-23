package Chapter4;

public class SoftwareSalesDriver {
    public static void main(String[] args) {
        softWareSalesDemo();
    }
    public static void softWareSalesDemo() {
        SoftwareSales sale0 = new SoftwareSales();

        // Let's input to the unitsSold field
        sale0.validateInput();

        // Now lets output the appropriate information based on the input
        System.out.println(sale0.displayInfo());
    }
}


