package chapter6;

import java.awt.*;

public class ParkedCarDriver {
    public static void main(String[] args) {
        demonstration();

    }

    public static void demonstration() {


        // create a car object
        ParkedCar car0 = new ParkedCar();

        //assign some values to the car objects fields

        // Color is an enum data type.
        // lets set this cars Color field to PURPLE
        car0.setColor(ParkedCar.Color.PURPLE);

        // set the make
        car0.setMake("Tesla");

        //set the model
        car0.setModel("S");

        // set the license plate field
        car0.setLicenseNum("ABC 1234");

        // set how many minutes the car has been parked
        car0.setTotalMinutesParked(61);

        // create a ParkingMeter object
        ParkingMeter meter0 = new ParkingMeter();

        // set the minutesPurchased to 60.
        meter0.setMinutesPurchased(60);

        // The minutes parked is more than the minutes purchased
        // which is going to spell trouble for this individual.

        // create a PoliceOfficer object and pass their name
        // and badge number to the constructor
        PoliceOfficer officer0 = new PoliceOfficer(
                "Gilbert",
                "P0l1C3");

        // lets allow the officer to inspect the car and the meter
        // If there is a parking violation, the inspect ticket method will
        // automatically create and print the ticket to the console.
        officer0.inspectMeter(car0, meter0);

    }
}
