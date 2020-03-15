package chapter6;

public class RoomDimension {
    private double roomLength;
    private double roomWidth;

    public RoomDimension(double roomLength, double roomWidth) {
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
    }

    public double getRoomArea() {
        return getRoomLength() * getRoomWidth();
    }
    public double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(double roomLength) {
        this.roomLength = roomLength;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }


    public String toString() {
        String str = "The length of the room = " +
                getRoomLength() + "\n" +
                "The width of the room = " +
                getRoomWidth() + "\n" +
                "The area of the room = " +
                getRoomArea() + "\n";

        return str;
    }
}
