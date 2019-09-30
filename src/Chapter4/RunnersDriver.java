package Chapter4;

public class RunnersDriver {
    public static void main(String[] args) {
        runnersDemo();
    }
    public static void runnersDemo() {
        // Create one runner
        Runner runner0 = new Runner();
        // This assigns a random number between 1-20 in the time field.
        runner0.setName("Brandon");
        runner0.setTime();

        // Create the second runner
        Runner runner1 = new Runner();
        runner1.setName("Nathan");
        runner1.setTime();

        // Create a third runner.
        Runner runner2 = new Runner();
        runner2.setName("Ryan");
        runner2.setTime();

        // randomize the runners times until none of them are equal.
        ensureNoTies(runner0, runner1, runner2);

        displayTheirTimes(runner0);
        displayTheirTimes(runner1);
        displayTheirTimes(runner2);

        System.out.println('\n'+placeTheRunners(runner0, runner1, runner2));
    }
    public static String placeTheRunners(Runner x, Runner y, Runner z) {
        return " In 1st place we have "+
                getFastest(x, y, z)+'\n'+
                " In second place we have "+
                getTheMiddleMan(x, y, z)+'\n'+
                " In last place we have "+
                getSlowest(x, y, z);
    }

    public static String getFastest(Runner x, Runner y, Runner z) {
        int a = 0;

        int b = x.getTime();
        int c = y.getTime();
        int d = z.getTime();

        while(b != 0 && c != 0 && d != 0) {
            b--;
            c--;
            d--;

            a++;
        }

        if (a == x.getTime()) {
            return x.getName();
        }
        else if(a == y.getTime()) {
            return y.getName();
        }
        else
            return z.getName();
    }
    public static String getSlowest(Runner x, Runner y, Runner z) {
        int a = x.getTime();
        int b = y.getTime();
        int c = z.getTime();

        if (a > b) {
            if (a > c) {
                return x.getName();
            }
            if (b > c) ;
            return y.getName();
        }
        if (b > c)
            return y.getName();

        return z.getName();
    }

    public static String getTheMiddleMan(Runner x, Runner y, Runner z) {
        String slowestTime =  getSlowest(x, y, z);
        String fastestTime = getFastest(x, y, z);

        if(x.getName() != slowestTime && x.getName() != fastestTime)
            return x.getName();
        if(y.getName() != slowestTime && y.getName() != fastestTime)
            return y.getName();
        else return z.getName();
    }



    /**
     * If any of the random numbers assigned to the times of the runner
     * happen to be the same, new random numbers will be assigned
     * until none of them are equal to each other.
     * @param x
     * @param y
     * @param z
     */
    public static void ensureNoTies(Runner x, Runner y, Runner z) {
        while( x.getTime() == y.getTime() ||
                x.getTime() == z.getTime() ||
                y.getTime() == z.getTime()
        ) {
            x.setTime();
            y.setTime();
            z.setTime();
        }
    }

    public static void displayTheirTimes(Runner x) {
        System.out.println(x.showNameAndTime());
    }
}
