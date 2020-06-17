package chapter9;

public class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private final int MIN_TRAINING_HOURS = 25;
    private int trainingHours;

    @Override
    public String toString() {
        return "TeamLeader{" +
                "monthlyBonus=" + monthlyBonus +
                ", MIN_TRAINING_HOURS=" + MIN_TRAINING_HOURS +
                ", trainingHours=" + trainingHours +
                "} " + super.toString();
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public int getMIN_TRAINING_HOURS() {
        return MIN_TRAINING_HOURS;
    }

    public int getTrainingHours() {
        return trainingHours;
    }

    public void setTrainingHours(int trainingHours) {
        this.trainingHours = trainingHours;
    }
}
