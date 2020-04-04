package chapter6;

import java.util.Random;

public class Coin {
    private String sideUp;

    public Coin() {
        toss();
    }

    public void toss() {
        Random random = new Random();
        int zeroOrOne = random.nextInt(2);

        if (zeroOrOne == 0) {
            sideUp = "heads";
        } else sideUp = "tails";
    }

    public String getSideUp() {
        return sideUp;
    }
}
