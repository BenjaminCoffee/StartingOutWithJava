package Chapter5;

public class CentigradeToFahrenheitTable {
    private double centigrade;


    public CentigradeToFahrenheitTable() {

    }

    public CentigradeToFahrenheitTable(double centigrade) {
        setCentigrade(centigrade);
    }
    public String calculateTableToTwentyDegrees() {

        // create a string builder object
        StringBuilder str = new StringBuilder();

        // set centigrade to zero before the loop starts
        setCentigrade(0);

        for (int i = 0; i <= 20; i++) {
           str.append(getCentigrade()+ " degrees centigrade = " +
                   calculateCentigradeToFahrenheit() + " degrees" +
                   " Fahrenheit."+ "\n");

            setCentigrade(getCentigrade() + 1);
        }
        return str.toString();
    }

    public double calculateCentigradeToFahrenheit() {
        return ( (getCentigrade() * (9.0/5.0) ) + 32.0);
    }

    public double getCentigrade() {
        return centigrade;
    }

    public void setCentigrade(double centigrade) {
        this.centigrade = centigrade;
    }

    public CentigradeToFahrenheitTable copy() {
        return new CentigradeToFahrenheitTable(centigrade);
    }
}
