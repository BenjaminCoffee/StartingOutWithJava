package chapter6;

public class InventoryItemDriver {
    public static void main(String[] args) {
        InventoryItem item0 = new InventoryItem("hammer", 24);
        InventoryItem item1 = new InventoryItem(item0);
        System.out.println(item1.toString());
    }
}
