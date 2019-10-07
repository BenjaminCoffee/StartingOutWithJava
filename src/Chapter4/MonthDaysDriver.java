package Chapter4;

public class MonthDaysDriver {
    public static void main(String[] args) {
        monthDaysDemo();
    }

    public static void monthDaysDemo() {
        // create an address for a MonthDays object.
        MonthDays program0;

        // pass the static int methods to the constructor's arguments.
        program0 = new MonthDays(MonthDays.askForMonth(), MonthDays.askForYear());
    }
}
