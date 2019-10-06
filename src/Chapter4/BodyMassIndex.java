package Chapter4;

public class BodyMassIndex {
    // in inches
    private double height;
    // in inches
    private double weight;

    public String statement() {
        return " Your BMI = "+ String.format("%.2f", returnBodyMassIndex())+ '\n'+
                " Your BMI is considered to be "+
                calculateWeightStatement();
    }
    public String calculateWeightStatement() {
        if(returnBodyMassIndex() > 0) {
            final double OPTIMAL_BMI_MIN = 18.5;
            final double OPTIMAL_BMI_MAX = 25.0;

            if (returnBodyMassIndex() < OPTIMAL_BMI_MIN) {
                return "under weight";
            }

            if (returnBodyMassIndex() > OPTIMAL_BMI_MAX) {
                return "over weight";
            }

            return "optimal";
        }
        else return " There was an error within the input process to the data fields.";
    }

    public double returnBodyMassIndex () {
        return (  getWeight() * (703 / (getHeight() * getHeight())) );
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
