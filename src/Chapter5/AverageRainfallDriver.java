package Chapter5;

public class AverageRainfallDriver {
    public static void main(String[] args) {
        AverageRainfall rainfall0;
        rainfall0 = new AverageRainfall();

        // Input an amount in to the data field.
        rainfall0.inputTimePeriodInYears();

        //rainfall0.setTimePeriodInYears(1);
        System.out.println(rainfall0.createStatement());

    }
}
