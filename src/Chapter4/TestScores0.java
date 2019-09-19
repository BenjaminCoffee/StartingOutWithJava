package Chapter4;

import Chapter2.AskUserForInput;

import java.text.DecimalFormat;

public class TestScores0 {

    // Lets modify this Class to contain only one field :)
    // We can rebuild it, we have the technology.

    // We are only asked to return an average of the test scores
    // and an equivalent letter grade.
    // So, having understood that, we can dump the total of all scores
    // in to one variable, making the resulting program use less memory :)
    // Why do we program?....Answer: "Memory management" - Prof. Dan Dao.

    // score will be our only field.
    private int score;

    public String displayAverage() {
        return "The average of the scores = "+
                formatADouble(calculateAverage());
    }
    public double calculateAverage () {
        return score/3.00;
    }
    public void inputSumToScore() {
        score = sumInput();
    }

    public int sumInput() {
        int testNumber = 1;
        int sum = 0;
        for ( ; testNumber <= 3; testNumber++) {
            sum = sum + promptUserAndReceiveInput(Integer.toString(testNumber));
        }

        return sum;
    }

    public int promptUserAndReceiveInput(String testNumber) {

        int sum = AskUserForInput.askUserForInteger(
                "Enter the score of test #"+ testNumber);
        return sum;
    }

    public String formatADouble(double aDouble) {
        DecimalFormat twoSpaces = new DecimalFormat("#.00");
        return twoSpaces.format(aDouble);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //******* This is the old code *******//
    /*
    private int score0;
    private int score1;
    private int score2;

    public TestScores0(int score0, int score1, int score2) {
        this.score0 = score0;
        this.score1 = score1;
        this.score2 = score2;
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

     */
}
