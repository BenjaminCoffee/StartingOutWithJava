package Chapter4;

import Chapter2.AskUserForInput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MagicDates {
    private int month;
    private int day;
    private int year;

    // We are going to use this no arg constructor to pass values to
    // the constructor with the three arguments below when these
    // objects are demonstrated/instantiated.
    public MagicDates() {

    }

    public MagicDates(int month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public String statement() {

        String aString = getMonth() + "/" + getDay() + "/" + getYear();

        if (isMagic()) {
            aString = aString + " is a magic date!";
        } else aString = aString + " is not a magic date :(";

        return aString;
    }

    public boolean isMagic() {
        if ((getDay() * getMonth()) == (getYear() % 100))
            return true;
        else return false;
    }

    public void inputDays() {
        setDay(askForDay());
    }

    public int askForDay() {
        int userInput;
        int maxNumOfDays = calculateMaximumInputForDays();
        do {
            userInput =
                    AskUserForInput.askUserForInteger(
                            "Please enter a day between 1 and " + maxNumOfDays
                    );
            if (userInput < 0 || userInput > maxNumOfDays) {
                System.out.println("The day must fall between " +
                        "1 and " + maxNumOfDays);
            }
        } while (userInput < 0 || userInput > maxNumOfDays);

        return userInput;
    }

    // because the maximum number of days in a month fluctuates based
    // on the year(leap years) and the month, we will use a MonthDays object
    // to calculate the maximum number of days allowed to be received
    // from the user.
    // for example, if the user enters 2(February), they may not
    // enter anything larger than 28, or 29(for a leap year).

    public int calculateMaximumInputForDays() {
        //create an address for a MonthDays object
        MonthDays mDays0;
        // reserve some memory for this MonthDays object and assign it
        // to the address we just created(mDays0).
        mDays0 = new MonthDays();

        int x = MonthDays.askForMonth();
        int y = MonthDays.askForYear();

        mDays0.setMonth(x);
        mDays0.setYear(y);

        setMonth(x);
        setYear(y);

        return mDays0.getNumberOfDays();
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
