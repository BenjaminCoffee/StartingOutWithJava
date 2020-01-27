package Chapter4;

import Chapter2.AskUserForInput;

public class SpeedOfSound {
    // Distance in feet.
    private double distance;

    public void handleUserSelectionForMenu() {
        String userSelection = returnUserInputForMenu();

        if (userSelection.equalsIgnoreCase("A")) {
            System.out.println("You have selected 'Air'.");
            inputDistanceFromUser();

            System.out.println('\n' + " " + getDistance() + " feet in air will be traversed" +
                    " by sound in " + getSpeedInAir() + " seconds.");
        }
        if (userSelection.equalsIgnoreCase("W")) {
            System.out.println("You have selected 'Water'.");
            inputDistanceFromUser();

            System.out.println('\n' + " " + getDistance() + " feet in water will be traversed" +
                    " by sound in " + getSpeedInWater() + " seconds.");
        }
        if (userSelection.equalsIgnoreCase("S")) {
            System.out.println("You have selected 'Steel'.");
            inputDistanceFromUser();

            System.out.println('\n' + " " + getDistance() + " feet in steel will be traversed" +
                    " by sound in " + getSpeedInSteel() + " seconds.");
        }
    }

    public void inputDistanceFromUser() {
        distance = returnUserInputForDistance();
    }

    public double returnUserInputForDistance() {
        double userInput;
        do {
            userInput = AskUserForInput.askUserForDouble(promptDistance());

            if (userInput < 0) {
                System.out.println("You may not enter a negative distance.");
            }
        } while (userInput < 0);

        return userInput;
    }

    public String returnUserInputForMenu() {
        String userInput;
        do {
            userInput = AskUserForInput.askForString(promptSubstance());

            if (!userInput.equalsIgnoreCase("A") &&
                    !userInput.equalsIgnoreCase("W") &&
                    !userInput.equalsIgnoreCase("S")) {
                System.out.println("That is not a valid selection.");
            }

        } while (!userInput.equalsIgnoreCase("A") &&
                !userInput.equalsIgnoreCase("W") &&
                !userInput.equalsIgnoreCase("S"));

        return userInput;
    }

    public String promptDistance() {
        return "Please enter the distance, in feet, to be traveled.";
    }

    public String promptSubstance() {
        return "Please type either 'A' for air, 'W' for water or 'S' for steel and press enter.";
    }

    public double getSpeedInSteel() {
        final double FEET_PER_SECOND = 16400.00;

        return getDistance() / FEET_PER_SECOND;
    }

    public double getSpeedInWater() {
        final double FEET_PER_SECOND = 4900.00;

        return getDistance() / FEET_PER_SECOND;
    }

    public double getSpeedInAir() {
        final double FEET_PER_SECOND = 1100.00;

        return getDistance() / FEET_PER_SECOND;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
