package Chapter3;

import Chapter2.AskUserForInput;

public class PayRoll {
    private String name;
    private int idNumber;
    private double hourlyWage;
    private double numHoursWorked;

    public PayRoll(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }
    public void askForHours() {
        setNumHoursWorked(
                AskUserForInput.askUserForDouble(
                        "Enter the hours worked for employee "+
                                getIdNumber()+getName()
                )
        );
    }
    public void askForRate() {
        setHourlyWage(
                AskUserForInput.askUserForDouble(
                        "Enter hourly wage for employee "+
                                getIdNumber()+getName()
                )
        );
    }

    public double getGrossPay() {
        return ( getHourlyWage() * getNumHoursWorked() );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getNumHoursWorked() {
        return numHoursWorked;
    }

    public void setNumHoursWorked(double numHoursWorked) {
        this.numHoursWorked = numHoursWorked;
    }
}
