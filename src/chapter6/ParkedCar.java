package chapter6;

public class ParkedCar {
    public enum Color {
        RED, YELLOW, BLUE, GREEN, PURPLE, WHITE, BLACK;
    }
    private Color color;
    private String make, model, licenseNum;
    private int totalMinutesParked;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public void setTotalMinutesParked(int totalMinutesParked) {
        this.totalMinutesParked = totalMinutesParked;
    }

    public Color getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public int getTotalMinutesParked() {
        return totalMinutesParked;
    }

    @Override
    public String toString() {
        return "ParkedCar{" +
                "color=" + color +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", licenseNum='" + licenseNum + '\'' +
                ", totalMinutesParked=" + totalMinutesParked +
                '}';
    }
}
