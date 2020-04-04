package chapter6;

import chapter2.AskUserForInput;

public class CoinGamePlayer {
    private String name;
    private int score;

    public CoinGamePlayer(String name) {
        this.name = name;
        //this.score = 0;
    }

    // player is asked to guess heads or tails and the answer is returned
    // as a string.
    public String makeGuess() {
        String guess;
        do {
            guess = AskUserForInput.askUserForString(
                    "Guess heads or tails");
            if (!guess.equalsIgnoreCase("heads")
                    &&
                    !guess.equalsIgnoreCase("tails")) {
                System.out.println("Invalid entry, please try again.");
            }
        } while (!guess.equalsIgnoreCase("heads")
                &&
                !guess.equalsIgnoreCase("tails"));

        return guess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
