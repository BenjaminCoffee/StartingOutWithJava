package Chapter3;

import java.text.DecimalFormat;

public class Temperature {
    private double fTemp;

    public String displayKelvin() {
        return formatDecimal(getKelvin());
    }

    public String displayCelsius() {
        return formatDecimal(getCelsius());
    }

    public String displayFahrenheit() {
        return formatDecimal(getfTemp());
    }

    public double getKelvin() {
        return ( ( (5.0/9.0) * (getfTemp()-32) ) + (273.0) );
    }

    public double getCelsius() {
        return ( (5.0/9.0) * (getfTemp()-32) );
    }

    public String formatDecimal(double aDouble) {
        DecimalFormat twoSpaces = new DecimalFormat("0.00");
        return (twoSpaces.format(aDouble));
    }

    public Temperature(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getfTemp() {
        return fTemp;
    }

    public void setfTemp(double fTemp) {
        this.fTemp = fTemp;
    }
}
