package Chapter5;

import Chapter2.AskUserForInput;

public class OrganismPopulation {
    private int startingPopulation;
    private double dailyPopIncrease;
    private int days;

    public void calculateStatement() {
        double population = getStartingPopulation();

        for (int day = 1; day <= getDays(); day++) {
            System.out.print(" ");
            System.out.print("After day ");
            System.out.println(day + ":");

            // calculate the population
            population = population + (population * getDailyPopIncrease());

            System.out.print(" population = "+ population);
            System.out.println();
        }
    }
    public void inputFields() {
        setStartingPopulation(askForStartingPopulation());
        setDailyPopIncrease(askForAverageDailyPopIncrease());
        setDays(askForDays());
    }
    public int askForDays() {
        return AskUserForInput.
                askUserForPositiveInteger("" +
                        "Please enter the time line in days " +
                        "as a positive integer.");
    }
    public double askForAverageDailyPopIncrease() {
        return AskUserForInput.
                askUserForPositiveDouble("Enter a positive" +
                        " decimal to represent the" +
                        " average daily population percent increase.");
    }

    public int askForStartingPopulation() {

        return AskUserForInput.
                askUserForInteger(2,
                        "Enter a starting" +
                                " population greater than or" +
                                " equal to 2.");
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getStartingPopulation() {
        return startingPopulation;
    }

    public void setStartingPopulation(int startingPopulation) {
        this.startingPopulation = startingPopulation;
    }

    public double getDailyPopIncrease() {
        return dailyPopIncrease;
    }

    public void setDailyPopIncrease(double dailyPopIncrease) {
        this.dailyPopIncrease = dailyPopIncrease;
    }
}
