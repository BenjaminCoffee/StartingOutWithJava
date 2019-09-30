package Chapter4;

import java.util.Random;

public class Runner {

    private String name;

    private int time;

    public String showNameAndTime() {
        return " "+ getName()+ " finished in "+ getTime()+ " minutes.";
    }

    /*
    public int getSlowest(int x, int y, int z) {
        if(x > y){
            if(x > z) {
                return x;
            }
            if( y > z);
            return y;
        }
        if(y > z)
        return y;

        return z;
    }

     */

    /*
    public int getTheMiddleMan(int x, int y, int z) {
        int slowestTime =  getSlowest(x, y, z);
        int fastestTime = getFastest(x, y, z);

        if(x != slowestTime && x != fastestTime)
            return x;
        if(y != slowestTime && y != fastestTime)
            return y;
        else return z;
    }


     */
    // Let's assign the times of the runners a random number between
    // one and twenty.
    public void setTime() {
        Random random = new Random();
        setTime(random.nextInt(20)+1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
