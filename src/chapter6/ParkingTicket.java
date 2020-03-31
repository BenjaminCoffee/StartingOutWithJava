package chapter6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ParkingTicket {
    private ParkedCar car;
    private ParkingMeter meter;
    private String officerName, officerNum;

    public ParkingTicket(
            ParkedCar car,
            ParkingMeter meter,
            String officerName,
            String officerNum) {
        this.car = car;
        this.meter = meter;
        this.officerName = officerName;
        this.officerNum = officerNum;
    }

    public String createTicketStatement() {
        StringBuilder str = new StringBuilder();
        str.append("Date: \n");
        str.append(
                new SimpleDateFormat("yyyyMMdd_HHmmss").
                        format(Calendar.getInstance().getTime()) + "\n");
        str.append("Vehicle: \n");
        str.append(getCar().toString() + "\n");
        str.append("Officer: \n");
        str.append(getOfficerName() + " " + getOfficerNum()+ "\n");
        str.append("Total minutes illegally parked: \n");
        str.append(car.getTotalMinutesParked() - meter.getMinutesPurchased()+ "\n");
        str.append("Fine: ");
        str.append(formatCurrency(calculateFine()));

        return str.toString();
    }

    public int calculateFine() {
        int illegalMinutes = car.getTotalMinutesParked() - meter.getMinutesPurchased();
        int fine = 0;

        while (illegalMinutes > 0) {
            fine = 25;
            illegalMinutes = illegalMinutes - 60;
            while (illegalMinutes >= 60) {
                fine = fine + 10;
                illegalMinutes = illegalMinutes - 60;
            }
            illegalMinutes = illegalMinutes % 60;
            if(illegalMinutes > 0) {
                fine = fine + 10;
                illegalMinutes = illegalMinutes - (illegalMinutes % 60);
            }
        }

        return fine;
    }

    public String formatCurrency(double amount) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return fmt.format(amount);
    }
    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public ParkingMeter getMeter() {
        return meter;
    }

    public void setMeter(ParkingMeter meter) {
        this.meter = meter;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOfficerNum() {
        return officerNum;
    }

    public void setOfficerNum(String officerNum) {
        this.officerNum = officerNum;
    }
}
