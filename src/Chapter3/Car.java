package Chapter3;

public class Car {
    private static final int MPH_INCREMENT = 5;
    private static final int MPH_DECREMENT = 5;
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }

    public void decelerateAndDisplaySpeed(int maxIterations) {
        int iterations = 0;

        while (iterations < maxIterations) {
            brake();
            System.out.println("Current speed = " +
                    getSpeed() + " Miles Per Hour");
            iterations++;
        }
    }

    public void accelerateAndDisplaySpeed(int maxIterations) {
        int iterations = 0;

        while (iterations < maxIterations) {
            accelerate();
            System.out.println("Current speed = " +
                    getSpeed() + " Miles Per Hour");
            iterations++;
        }
    }

    public void accelerate() {
        setSpeed(speed + MPH_INCREMENT);
    }

    public void brake() {
        setSpeed(speed - MPH_DECREMENT);
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
