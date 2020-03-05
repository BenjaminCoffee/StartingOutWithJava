package Chapter5;

import Chapter2.AskUserForInput;

import java.util.Random;

public class SlotMachine {
    private double money;

    public void playTheGame() {

        //ask user for their bet.

        // input user bet to money field
        inputBetToMoneyField();


        //call a method that generates a random number between
        // 0 and 5, (six options total).

        // return the generated number to a method
        // with a switch statement that returns one of the
        // words, 'Cherries', 'Oranges', etc.
        // compare each word to the previously generated word
        // if(word.matches(word) - add a point.

        // if 0 points, - no money
        // if 1 point, - double money
        // if 2 points, - triple the money, etc.


    }

    public String returnASymbol(int theRandomNumber) {
        switch(theRandomNumber) {
            case 0 :
                return "Cherries";
            case 1 :
                return "Oranges";
            case 2 :
                return "Plums";
            case 3 :
                return "Bells";
            case 4 :
                return "Melons";
            case 5 :
                return "Bars";
        }

        return "There was an error in the program.";
    }

    public int returnRandomNumBetweenOneAndFive() {
        Random randomObj = new Random();
        int oneThroughFive = randomObj.nextInt(5);

        if (oneThroughFive < 0 || oneThroughFive > 5) {
            System.out.println("There has been an error in " +
                    "generating a random number. The program will not terminate.");
            System.exit(0);
        }
        return oneThroughFive;
    }

    public void inputBetToMoneyField() {
        setMoney(askUserForMoneyDeposited());
    }

    public double askUserForMoneyDeposited() {
        return AskUserForInput.askUserForPositiveDouble(
                "Place your bet: ");
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
