package chapter6;

public class InventoryItem {
    private String description;
    private int units;

    public InventoryItem() {

    }

    public InventoryItem(String description, int units) {
        this.description = description;
        this.units = units;
    }

    public InventoryItem(InventoryItem objectToBeCopied) {
        this.description = objectToBeCopied.description;
        this.units = objectToBeCopied.units;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "description='" + description + '\'' +
                ", units=" + units +
                '}';
    }
}
