package Chapter4;

public class MonthDaysDriver {
    public static void main(String[] args) {
        monthDaysDemo();
    }

    public static void monthDaysDemo() {
        // pass the static int methods to the constructor's arguments.
        MonthDays program0 = new MonthDays(MonthDays.askForMonth(), MonthDays.askForYear());
    }
}
