package chapter4;

public class TestScores0Driver {
    public static void main(String[] args) {
        testScores0Demo();
    }

    public static void testScores0Demo() {
        TestScores0 tests0 = new TestScores0();
        tests0.inputSumToScore();
        System.out.println(tests0.displayAverage());
    }
}
