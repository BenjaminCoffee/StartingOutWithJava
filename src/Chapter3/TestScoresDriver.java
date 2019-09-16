package Chapter3;

import Chapter2.AskUserForInput;

public class TestScoresDriver {
    public static void main(String[] args) {
        testScoresDemo();
    }

    public static void testScoresDemo() {
        TestScores set0 = new TestScores(
                AskUserForInput.askUserForInteger(
                        "Enter the first test score."
                ),
                AskUserForInput.askUserForInteger(
                        "Enter the second test score."
                ),
                AskUserForInput.askUserForInteger(
                        "Enter the third test score."
                )
        );

        System.out.println(set0.formatADouble(set0.returnAverage()));
    }
}
