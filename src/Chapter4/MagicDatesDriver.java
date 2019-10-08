package Chapter4;

public class MagicDatesDriver {
    public static void main(String[] args) {
        magicDatesDemo();
    }

    public static void magicDatesDemo() {

        // create a no arg constructor to use as a temporary holder
        // for the values we want to input to the 3 arg constructor.

        MagicDates date0 = new MagicDates();

        //date0.inputDays();

        // Now lets create the three args constructor from MagicDates

        //create the address
        MagicDates date1;

        date1 = new MagicDates(date0.getMonth(), date0.getYear(), date0.getDay());
        // we now have valid data to work with inside date1.

        // Is the date we passed magic?

        // if the last 2 digits of the year equal the day times the month number.
        System.out.println(date1.statement());
    }
}
