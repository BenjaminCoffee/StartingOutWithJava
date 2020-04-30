package chapter7;

import chapter2.AskUserForInput;

public class Player {
    enum playerIdentity {PLAYER1, PLAYER2,}

    private playerIdentity playerIdentifier;
    private  int score;

    public int makeGuess() {
        int selection = 0;
        do {
            selection = AskUserForInput.askUserForInteger(
                    "Enter a selection between 1 - 4"
            );
            if (selection < 1 || 4 < selection) {
                System.out.println("Input invalid");
            }
        } while (selection < 1 || 4 < selection);
        return selection;
    }

    public playerIdentity getPlayerIdentifier() {
        return playerIdentifier;
    }

    public void setPlayerIdentifier(playerIdentity playerIdentifier) {
        this.playerIdentifier = playerIdentifier;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
