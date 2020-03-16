package chapter6;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Named this class Months because there is a Month class in the java api
 * introduced in java 8.
 */
public class Months {
    private int monthNumber;

    public Months() {
        monthNumber = 1;
    }

    public Months(int monthNumber) {
        if (    monthNumber >= 1
                &&
                monthNumber <= 12) {
            this.monthNumber = monthNumber;
        }
        else this.monthNumber = 1;
    }

    public Months(String monthName) throws java.text.ParseException {
        monthNumber = convertMonthNameToInt(monthName);
    }

    public int convertMonthNameToInt(String monthName) throws java.text.ParseException {
        Date date = new SimpleDateFormat("MMMM").parse(monthName);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return(cal.get(Calendar.MONTH) + 1);
    }

    public boolean equals(Months objectToBeCompared) {
        if (objectToBeCompared.getMonthNumber()
                ==
                this.monthNumber) {
            return true;
        }
        return false;
    }

    public boolean lessThan(Months objectToBeCompared) {
        if (objectToBeCompared.getMonthNumber()
                >
                this.monthNumber) {
            return true;
        }
        return false;
    }

    public boolean greaterThan(Months objectToBeCompared) {
        if (objectToBeCompared.getMonthNumber()
                <
                this.monthNumber) {
            return true;
        }
        return false;
    }

    public void setMonthNumber(int monthNum) {
        if (monthNum >= 1
                &&
                monthNum <= 12) {
            monthNumber = monthNum;
        }
        else {
            monthNumber = 1;
        }
    }

    public String getMonthName() {
        return Month.of(monthNumber).name();
    }
    public int getMonthNumber() {
        return monthNumber;
    }

    public String toString() {
        String str = "Months:" +
                "\n" +
                " month name = " +
                getMonthName() +
                "\n" +
                " month number = " +
                getMonthNumber();

        return str;
    }
}
