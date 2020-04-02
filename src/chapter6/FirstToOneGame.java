package chapter6;

import chapter2.AskUserForInput;

public class FirstToOneGame {
    private Player player1;
    private Player player2;
    //private Player player3;
    //private Player player4;

    // the big void method
    //
    public void playTheGame() {
        player1 = new Player();
        player2 = new Player();
        assignNames();

        //a method that plays the turns on a loop until
        // one of the players scores = 1
        loopUntilAScoreEqualsOne();
    }

    public void loopUntilAScoreEqualsOne() {
        while (true) {
            playTurn(player1);
            System.out.println(displayStatsAfterRolling(player1));
            playTurn(player2);
            System.out.println(displayStatsAfterRolling(player2));

            if (checkForWinner(player1, player2)) {
                break;
            }
        }

    }

    public boolean checkForWinner(Player player1, Player player2) {
        if (player1.getPoints() == 1 && player2.getPoints() == 1) {
            System.out.println(player1.getIdentifier() + " the game is a tie!");
            return true;
        } else if (player1.getPoints() == 1) {
            System.out.println(player1.getIdentifier() + ", "+
                    player1.getName()+ ", "+
                    " has won the game!");
            return true;
        }
        else if(player2.getPoints() == 1) {
            System.out.println(player2.getIdentifier() + ", "+
                    player2.getName()+ ", "+
                    " has won the game!");
            return  true;
        }
        return false;
    }


    public String displayStatsAfterRolling(Player player) {
        StringBuilder str = new StringBuilder();
        str.append(player.getIdentifier()+", "+ player.getName()+ ":\n");
        str.append(" roll = ");
        str.append(player.getRoll());
        str.append(" Score = ");
        str.append(player.getPoints());

        return str.toString();
    }

    public void playTurn(Player player) {
        int playerRoll = player.rollTheDice();
        player.setRoll(playerRoll);

        if ( (player.getPoints() - playerRoll) < 0) {
            player.setPoints(player.getPoints() + playerRoll);
        }
        else {
            player.setPoints(player.getPoints() - playerRoll);
        }

    }

    public void assignNames() {
        player1.setIdentifier("player 1");
        player1.setName(askPlayerForName( player1.getIdentifier()+
                ", please enter your name: "));
        player2.setIdentifier("player 2");
        player2.setName(askPlayerForName(player2.getIdentifier()+
                ", please enter your name"));
    }

    // we need to find the player objects whom have names
    // because these are the only ones that we will be using.

    //player1 object passed to a method that rolls his Die,
    // records the die value and add / subtracts points to score.

    /*
    public boolean isThereAValueInName(Player player) {
        if (player.getName() != null) {
            return true;
        }
        return false;
    }

     */

    /*
    public void inputPlayerNames(int numOfPlayers) {
        switch (numOfPlayers) {
            case 1 :
                System.out.print("Player 1, ");
                player1.setName(askPlayerForName());
                break;
            case 2 :
                System.out.print("Player 1, ");
                player1.setName(askPlayerForName());
                System.out.print("Player 2, ");
                player2.setName(askPlayerForName());
                break;
            case 3 :
                System.out.print("Player 1, ");
                player1.setName(askPlayerForName());
                System.out.print("Player 2, ");
                player2.setName(askPlayerForName());
                System.out.print("Player 3, ");
                player3.setName(askPlayerForName());
                break;
            case 4 :
                System.out.print("Player 1, ");
                player1.setName(askPlayerForName());
                System.out.print("Player 2, ");
                player2.setName(askPlayerForName());
                System.out.print("Player 3, ");
                player3.setName(askPlayerForName());
                System.out.print("Player 4, ");
                player4.setName(askPlayerForName());
                break;
        }
    }

     */
    public String askPlayerForName(String userPrompt) {
        return AskUserForInput.askUserForString(
                userPrompt);
    }

    // this method will ask for and return the number of players.
    // ask for num of players
    //region Ask the user for number of players and validate the input.
    /*
    public int askForNumberOfPlayers() {
        return AskUserForInput.askUserForPositiveInteger(
                "Enter the number of players (1-4): "
        );
    }
    public int returnValidatedUserInputForNumOfPlayers() {
        int userInput = 0;
        do {
            userInput = askForNumberOfPlayers();
            if (userInput < 1 || userInput > 4) {
                System.out.println("Your input was invalid.");
            }
        }while(userInput < 1 || userInput > 4);
        return userInput;
    }

     */
    //endregion
    
}
