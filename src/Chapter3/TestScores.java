package chapter3;

import java.text.DecimalFormat;

public class TestScores {
    private int score0;
    private int score1;
    private int score2;

    public TestScores(int score0, int score1, int score2) {
        this.score0 = score0;
        this.score1 = score1;
        this.score2 = score2;
    }
    public String formatADouble(double aDouble) {
        DecimalFormat twoSpaces = new DecimalFormat("#.00");
        return twoSpaces.format(aDouble);
    }
    public double returnAverage() {
        return  ( (score0 + score1 + score2) / (3.0) );
    }
    public int getScore0() {
        return score0;
    }

    public void setScore0(int score0) {
        this.score0 = score0;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }
}
