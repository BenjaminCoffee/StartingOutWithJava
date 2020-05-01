package chapter3;

public class TemperatureDriver {
    public static void main(String[] args) {

        fTempConversionDemo();
    }
    public static void fTempConversionDemo() {

        // Assign the fTemp field in temp0
        Temperature temp0 = new Temperature(32.00);

        // Display the temperature in Fahrenheit rounded to
        //two decimal places.
        System.out.print("The temperature in Fahrenheit = ");
        System.out.println(temp0.displayFahrenheit());

        // Display the temperature converted to Celsius and rounded
        //to two decimal places.
        System.out.print("The temperature in Celsius = ");
        System.out.println(temp0.displayCelsius());

        // Display the temperature converted to Kelvin and rounded
        //to two decimal places.
        System.out.print("The temperature in Kelvin = ");
        System.out.println(temp0.displayKelvin());
    }
}
