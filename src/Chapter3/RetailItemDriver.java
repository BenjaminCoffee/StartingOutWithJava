package chapter3;

public class RetailItemDriver {
    public static void main(String[] args) {
        createThreeItems();
    }

    public static void createThreeItems() {
        RetailItem item0 = new RetailItem(
                "Jacket",
                12,
                59.95
        );
        RetailItem item1 = new RetailItem(
                "Designer Jeans",
                40,
                34.95
        );
        RetailItem item2 = new RetailItem(
                "Shirt",
                20,
                24.95
        );
    }
}
