package Chapter4;

import Chapter2.AskUserForInput;

public class HotDogCookout {
    private int people;
    private int hotDogsPerPerson;

    public void wrapper() {
        inputPeople();
        inputHotDogsPerPerson();
        System.out.println(statement());
    }

    public String statement() {
        return " Amount of hot dogs needed = " + getHotDogsNeeded() +
                '\n' +
                " Amount of wiener packs needed = " + getWienerPacksNeeded() +
                '\n' +
                " Amount of bun packs needed = " + getBunPacksNeeded() +
                '\n' +
                " Total amount of wieners leftover = " + calculateWienersLeftOver() +
                '\n' +
                " Total amount of buns leftover = " + calculateBunsLeftOver();
    }

    public int calculateWienersLeftOver() {
        return (totalWienersPurchased() - getHotDogsNeeded());
    }

    public int calculateBunsLeftOver() {
        return (totalBunsPurchased() - getHotDogsNeeded());
    }

    //region calculate the total amount of individual
    // wieners and buns purchased
    public int totalBunsPurchased() {
        return getBunPacksNeeded() * 8;
    }

    public int totalWienersPurchased() {
        return getWienerPacksNeeded() * 10;
    }
    //endregion


    //region - calculate total wiener and bun packs needed based on fields.
    public int getBunPacksNeeded() {
        // convert the value of getHotDogsNeeded to a double
        // call Math.ceil on the value of getHotDogsNeeded / 8
        // (for example, 1.2 becomes 2.0)
        // cast the resulting whole double number to an int.
        return (int) (Math.ceil(Double.valueOf(getHotDogsNeeded()) / 8));
    }

    public int getWienerPacksNeeded() {
        // convert the value of getHotDogsNeeded to a double
        // call Math.ceil on the value of getHotDogsNeeded / 10
        // (for example, 1.2 becomes 2.0)
        // cast the resulting whole double number to an int.
        return (int) (Math.ceil(Double.valueOf(getHotDogsNeeded()) / 10));
    }

    public int getHotDogsNeeded() {
        return (getPeople() * getHotDogsPerPerson());
    }
    //endregion


    //region - Methods used to take input from the user and assign input to
    // object fields.

    //region - Methods used to input to hotDogsPerPerson field from the user.
    public void inputHotDogsPerPerson() {
        setHotDogsPerPerson(askForDogsPerPerson());
    }

    public int askForDogsPerPerson() {
        int userInput;
        do {
            userInput = AskUserForInput.askUserForInteger(
                    "Enter the hot dogs per person:"
            );
            if (userInput < 0) {
                System.out.println("The number may not be negative.");
            }
        } while (userInput < 0);

        return userInput;
    }
    //endregion

    //region - Methods used to input to people field from the user
    public void inputPeople() {
        setPeople(askForPeople());
    }

    public int askForPeople() {
        int userInput;
        do {
            userInput = AskUserForInput.askUserForInteger(
                    "Enter the amount of people in attendance:"
            );
            if (userInput < 0) {
                System.out.println("The number may not be negative.");
            }
        } while (userInput < 0);

        return userInput;
    }
    //endregion

    //endregion


    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        if (people >= 0) {
            this.people = people;
        }
    }

    public int getHotDogsPerPerson() {
        return hotDogsPerPerson;
    }

    public void setHotDogsPerPerson(int hotDogsPerPerson) {
        if (hotDogsPerPerson >= 0) {
            this.hotDogsPerPerson = hotDogsPerPerson;
        }
    }
}
