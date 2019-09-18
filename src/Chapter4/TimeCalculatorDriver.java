package Chapter4;

public class TimeCalculatorDriver {
    public static void main(String[] args) {
        timeCalculatorDemo();
    }
    public static void timeCalculatorDemo() {
        TimeCalculator time0 = new TimeCalculator();
        System.out.println(time0.displayTime());
    }
}
