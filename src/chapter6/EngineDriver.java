package chapter6;

public class EngineDriver {
    public static void main(String[] args) {
        demonstration();
    }

    protected static void demonstration() {

        // create a brand new engine.
        Engine newEngine = new Engine();

        // the tank should be empty, lets check.
        System.out.println(newEngine.checkTheTank());

        // let's fill up the tank(a maximum of 15 gallons).
        newEngine.fillUpTheTank();
        System.out.println("After filling up the tank...");

        // lets see if its filled up.
        System.out.println(newEngine.checkTheTank());

        // the tank is completely full, let try to add some more fuel to it
        // and see what happens.
        newEngine.addOneGallonOfFuelToTheTank();
        // we get a message that the tank is full.

        // now lets drive 360 miles to empty the gas tank.
        newEngine.run(360);

        System.out.println("We have depleted the gas tank");
        //when we try to drive another mile, we will get a
        // message letting us know the engine can not run anymore
        newEngine.run(1);

        newEngine.addOneGallonOfFuelToTheTank();
        System.out.println(newEngine.printFuelGaugeAndOdometerValues());
        newEngine.runTillEmpty();

        System.out.println(newEngine.printFuelGaugeAndOdometerValues());

    }
}
