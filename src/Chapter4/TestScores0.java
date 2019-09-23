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
        return " The average of the scores = "+
                formatADouble(calculateAverage())+
                "\n"+
                " Your grade = "+
                calculateGrade();
    }
    public char calculateGrade() {
        double average = calculateAverage();

        if ( average < 60 && average >= 0 ) {
            return 'F';
        }
        else if ( average >= 60 && average < 70 ) {
            return 'D';
        }
        else if ( average >= 70 && average < 80 ) {
            return 'C';
        }
        else if ( average >= 80 && average < 90) {
            return 'B';
        }
        else
            return 'A';
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

    // Consider decomposing this in to two methods.
    public int promptUserAndReceiveInput(String testNumber) {
        int sum = 0;
        do {
            sum = AskUserForInput.askUserForInteger(
                    "Enter the score of test #" + testNumber);
            if( sum < 0 || sum > 100) {
                System.out.println(" A valid score was not entered, please try again.");
            }
        }while( sum < 0 || sum > 100 );
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
