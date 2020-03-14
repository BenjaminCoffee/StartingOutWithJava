package chapter4;

public class SpeedOfSoundDriver {
    public static void main(String[] args) {
        speedOfSoundDemo();
    }
    public static void speedOfSoundDemo() {
        SpeedOfSound calculation0 = new SpeedOfSound();
        //System.out.println(calculation0.returnUserInputForMenu());
        //System.out.println(calculation0.returnUserInputForDistance());
        calculation0.handleUserSelectionForMenu();
    }
}
