package chapter6;

public class RoomCarpet {
    private RoomDimension roomDimension;
    private double pricePerSquareFoot;

    public RoomCarpet(RoomDimension roomDimension, double pricePerSquareFoot) {
        this.roomDimension = roomDimension;
        this.pricePerSquareFoot = pricePerSquareFoot;
    }
    public double getTotalPrice() {
        return getRoomDimension().getRoomArea() * getPricePerSquareFoot();
    }

    public RoomDimension getRoomDimension() {
        return roomDimension;
    }

    public void setRoomDimension(RoomDimension roomDimension) {
        this.roomDimension = roomDimension;
    }

    public double getPricePerSquareFoot() {
        return pricePerSquareFoot;
    }

    public void setPricePerSquareFoot(double pricePerSquareFoot) {
        this.pricePerSquareFoot = pricePerSquareFoot;
    }

    public String toString() {
        String str = getRoomDimension().toString() +
                "The price per square foot = " +
                getPricePerSquareFoot() + "\n" +
                "The total cost of carpet = " +
                getTotalPrice() + "\n";

        return str;
    }
}
