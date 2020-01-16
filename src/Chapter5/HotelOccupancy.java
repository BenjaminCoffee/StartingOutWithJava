package Chapter5;

import Chapter2.AskUserForInput;

import java.text.NumberFormat;
import java.util.Locale;

public class HotelOccupancy {
    private int floors;

    public void wrapItUp() {
        inputFloors();
        displayStatement();
    }
    public void displayStatement() {
        System.out.println(calculateStatement());
    }
    public String calculateStatement() {
        String statement = "";
        int roomsPerFloor= 0;
        int roomsOccupiedPerFloor = 0;
        int totalRooms = 0;
        int totalRoomsOccupied = 0;

        for (int floor = 1; floor <= getFloors(); floor++) {

            // user prompt
            System.out.println("For floor "+ floor+"...\n");

            // take total rooms by floor and sum them
            roomsPerFloor = askForRooms();
            totalRooms = totalRooms + roomsPerFloor;

            // take total rooms occupied by floor and sum them
            roomsOccupiedPerFloor = askForRoomsOccupied();
            totalRoomsOccupied = totalRoomsOccupied + roomsOccupiedPerFloor;

            // append to the end of the statement String
            statement = statement + "floor " + floor +
                    " has " + roomsOccupiedPerFloor + " of " +
                    roomsPerFloor + " rooms occupied.\n\n";
        }

        // append a summation to the end of the statement string.
        statement = statement +
                "Number of floors = " + getFloors() + "\n"+
                "Total number of rooms = " + totalRooms + "\n" +
                "Total number of rooms occupied = " + totalRoomsOccupied + "\n" +
                "Hotel occupancy rate = "+
                        formatDoubleToPercent((double)(totalRoomsOccupied)/
                                (double)(totalRooms));

        return statement;
    }

    public String formatDoubleToPercent(double theDouble) {
        NumberFormat formatter = NumberFormat.getPercentInstance(Locale.US);
        return formatter.format(theDouble);
    }
    public int askForRoomsOccupied() {
        return AskUserForInput.askUserForPositiveInteger(
                "Please enter the amount of rooms occupied:"
        );
    }
    public int askForRooms() {
        return AskUserForInput.askUserForPositiveInteger(
                "Please enter the number of rooms:"
        );
    }
    public void inputFloors() {
        setFloors(askForFloors());
    }
    public int askForFloors() {
        return AskUserForInput.askUserForPositiveInteger(
                "Please enter the number of floors:"
        );
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
