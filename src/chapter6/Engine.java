package chapter6;

public class Engine {
    private FuelGauge fuelGauge;
    private Odometer odometer;

    // a used engine
    public Engine(int miles) {
        odometer = new Odometer(miles);
        fuelGauge = new FuelGauge(0);
    }

    // a new engine.
    public Engine() {
        fuelGauge = new FuelGauge(0);
        odometer = new Odometer(0);
    }

    public void runTillEmpty() {
        while (fuelGauge.getGallons() > 0) {
            driveOneMile();
        }
    }

    public void run(int miles) {
        for (int i = 0; i < miles; i++) {
            driveOneMile();
            System.out.println(printFuelGaugeAndOdometerValues());
        }
    }

    public void driveOneMile() {
        final int FUEL_EFF_RATE = 24;

        if(fuelGauge.getGallons() > 0) {
            odometer.incrementMilesByOne();
            if (odometer.getMileage() % FUEL_EFF_RATE == 0) {
                fuelGauge.decrementGallonsByOne();
            }
        } else System.out.println("The engine can not run because the" +
                " tank is out of gas.");
    }

    public String printFuelGaugeAndOdometerValues() {
        StringBuilder str = new StringBuilder();
        str.append("the odometer reads ");
        str.append(odometer.getMileage());
        str.append(" miles\n");
        str.append("the tank has ");
        str.append(fuelGauge.getGallons());
        str.append(" gallons left\n");

        return str.toString();
    }

    public void addOneGallonOfFuelToTheTank() {
        fuelGauge.incrementGallonsByOne();
    }
    public void fillUpTheTank() {
        while (fuelGauge.getGallons() < 15) {
            addOneGallonOfFuelToTheTank();
        }
    }

    public String checkTheTank() {
        StringBuilder str = new StringBuilder();
        str.append("the engine's fuelGauge reads = ");
        str.append(getGallons());
        str.append(" gallons");

        return str.toString();
    }

    public int getGallons() {
        return fuelGauge.getGallons();
    }
}
