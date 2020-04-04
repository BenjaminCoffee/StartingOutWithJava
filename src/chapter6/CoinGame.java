package chapter6;

public class CoinGame {
    private CoinGamePlayer player1;
    private CoinGamePlayer player2;

    public void play() {

        // create the players
        player1 = new CoinGamePlayer("Goober");
        player2 = new CoinGamePlayer("Beavis");

        while (true) {

            // prompt player1
            displayPlayerName(player1);
            // store their guess for use later in the method.
            String player1Guess = player1.makeGuess();

            //prompt player2
            displayPlayerName(player2);
            // store their guess for later in the method.
            String player2Guess = player2.makeGuess();

            //create a coin, the constructor will toss it
            Coin coin = new Coin();
            String result = coin.getSideUp();

            // echo the user's guesses.
            // playerName, you guessed...heads, you were correct or you were wrong
            displayUserGuess(player1, player1Guess);
            rightOrWrong(player1Guess, result);
            displayUserGuess(player2, player2Guess);
            rightOrWrong(player2Guess, result);

            //method called calculate player score
            // pass the two player objects and String, coin result to method.
            // if the player.getGuess == result...
            calculateScore(player1Guess, player2Guess, result);
            System.out.println(player1.getScore());
            System.out.println(player2.getScore());

            //if one of the scores equals five,
            // display the winner and break the loop.
            if (isThereAWinner(player1, player2)) {
                break;
            }
        }

    }

    public boolean isThereAWinner(CoinGamePlayer player1, CoinGamePlayer player2) {
        if (player1.getScore() == 5 && player2.getScore() == 5) {
            System.out.println("There was a tie!!!");
            return true;
        } else if (player1.getScore() == 5) {
            displayPlayerName(player1);
            System.out.println(" has won!!!");
            return true;
        } else if (player2.getScore() == 5) {
            displayPlayerName(player2);
            System.out.println(" has won!!!");
            return true;
        }
        return false;
    }

    /*
    public boolean isPlayerScoreEqualToFive(CoinGamePlayer player) {
        if (player.getScore() == 5) {
            return true;
        }
        return false;
    }

     */

    public void calculateScore(String player1Guess,
                               String player2Guess,
                               String tossResult) {
        // calculate score for player1 in accordance with their guess.
        if (player1Guess.equalsIgnoreCase(tossResult)) {
            player1.setScore(player1.getScore() + 1);
        } else if (player1.getScore() > 0) {
            player1.setScore(player1.getScore() - 1);
        }

        // calculate score for player2 in accordance with their guess.
        if (player2Guess.equalsIgnoreCase(tossResult)) {
            player2.setScore(player2.getScore() + 1);
        } else if (player2.getScore() > 0) {
            player2.setScore(player2.getScore() - 1);
        }
    }

    public void rightOrWrong(String guess, String result) {
        if (guess.equalsIgnoreCase(result)) {
            System.out.println("You guessed right!");
        }
        else System.out.println("You guessed wrong...");
    }

    public void displayUserGuess(CoinGamePlayer player, String guess) {
        displayPlayerName(player);
        System.out.println("You guessed "+ guess);
    }

    public void displayPlayerName(CoinGamePlayer player) {
        System.out.println(player.getName() + ", ");
    }

}
