package chapter5;

import chapter2.AskUserForInput;

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
        calculateWinnings(calculateNumOfSymbolMatches());
        System.out.println("Your total: $"+ getMoney());

    }

    public void calculateWinnings(int numOfMatches) {
        switch (numOfMatches) {
            case 0 :
                setMoney(getMoney());
                break;
            case 1 :
                setMoney(getMoney() * 2);
                break;
            case 2 :
                setMoney(getMoney() * 3);
                break;
        }
    }

    public int calculateNumOfSymbolMatches() {
        String[] symbolArray = new String[3];
        String[] panelArray = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
        int counter = 0;
        int score = 0;

        for (int i = 0; i < 3; i++) {
            symbolArray[i] = returnASymbol(returnRandomNumBetweenOneAndFive());
            System.out.println(symbolArray[i]);
        }


        for (int i = 0; i < panelArray.length; i++) {
            // reset the counter to zero to test each index of the panel array.
            counter = 0;
            for (int j = 0; j < symbolArray.length; j++) {

                if (panelArray[i].equalsIgnoreCase(symbolArray[j])) {
                    counter++;
                }
            }
            if (counter == 1) {
                score = 0;
            }
            if (counter == 2) {
                score = 1;
                break;
            }
            if (counter == 3) {
                score = 2;
                break;
            }
        }

        return score;
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

        // let's hope this line of code is never read.
        System.out.println("There was an error in the returnASymbol method.");

        // or this one.
        return "";
    }

    public int returnRandomNumBetweenOneAndFive() {
        Random randomObj = new Random();
        int oneThroughFive = randomObj.nextInt(6);

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
