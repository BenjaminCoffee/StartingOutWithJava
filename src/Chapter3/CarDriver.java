package Chapter3;

import Chapter2.AskUserForInput;

public class CarDriver {

    public static void main(String [] args) {
        speedUpAndSlowDown();
    }

    public static void speedUpAndSlowDown() {
        final int NUM_OF_ITERATIONS = 5;

        Car car0 = new Car(2005, "Mitsubishi");
        /*
        //Asking the user how many times they would like to accelerate the car.
        car0.accelerateAndDisplaySpeed(
                AskUserForInput.
                        askUserForInteger(
                                "How many times would you"+
                                " like to press the pedal?"));

         */

        //Passing an int to the method instead of asking the user
        //for an int.
        car0.accelerateAndDisplaySpeed(NUM_OF_ITERATIONS);
        System.out.println();
        System.out.println("Now beginning deceleration");
        System.out.println();
        //Passing an integer to the method as opposed to asking
        //the user for one.
        car0.decelerateAndDisplaySpeed(NUM_OF_ITERATIONS);
    }
}
