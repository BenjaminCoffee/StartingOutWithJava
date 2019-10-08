package Chapter4;

import Chapter2.AskUserForInput;

public class MonthDays {
    private int month;
    private int year;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
        System.out.println(statement());
    }

    // created this no args constructor to use in conjunction with
    // a MagicDates object.
    public MonthDays() {

    }

    public String statement() {
        return " The month "+ getMonth()+ ", in year "+ getYear()+
                ", contains "+ getNumberOfDays()+ " days.";
    }
    public int getNumberOfDays() {
        if(getMonth() == 2) {
            if(isItALeapYear() == true) {
                return 29;
            }
            else return 28;
        }
        else if (
                getMonth() == 4 ||
                getMonth() == 6 ||
                getMonth() == 9 ||
                getMonth() == 11)
        {
            return 30;
        }
        else return 31;
    }
    public boolean isItALeapYear() {

        if(getYear() % 4 == 0)
        return true;

        else return false;
    }

    //region - Methods to input to fields.
    public void inputYear() {
        setYear(askForYear());
    }

    // This method was changed to static so that it may be input as a constructor
    // argument during initialization of a MonthDays object.
    public static int askForYear() {
        int userInput;
        do {
            userInput =
                    AskUserForInput.askUserForInteger(
                            "Please enter a number for the year:"
                    );
            if(userInput < 1) {
                System.out.println("That is not a valid entry, please try again.");
            }
        }while(userInput < 1);

        return userInput;

    }
    public void inputMonth() {
        setMonth(askForMonth());
    }

    // This method was changed to static so that it may be input as a constructor
    // argument during initialization of a MonthDays object.
    public static int askForMonth() {
        int userInput;
        do {

            userInput =
                    AskUserForInput.askUserForInteger(
                    "Please enter a number for the month (1 - 12):"
            );
            if(userInput < 1 || userInput > 12) {
                System.out.println("That is not a valid entry, please try again.");
            }
        }while(userInput < 1 || userInput > 12);

        return userInput;

    }
    //endregion

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
