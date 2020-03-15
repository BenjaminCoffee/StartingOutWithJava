package chapter6;

public class RoomCarpetDriver {
    public static void main(String[] args) {
        RoomDimension livingRoom0 = new RoomDimension(
                10.00, 14.00);

        RoomCarpet livingRoom0Carpet = new RoomCarpet(
                livingRoom0, 10.00);

        System.out.println(livingRoom0Carpet.toString());
    }
}
