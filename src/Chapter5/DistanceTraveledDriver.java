package Chapter5;

import java.io.FileNotFoundException;

public class DistanceTraveledDriver {
    public static void main(String[] args)
    throws FileNotFoundException {
        DistanceTraveled journey0 = new DistanceTraveled();
        journey0.inputMphAndHours();
        journey0.displayTravelStats();
        journey0.writeToTheFile();
    }
}
