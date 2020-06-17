package chapter9;

public class ShiftSupervisor extends Employee {
    public double annualSalary;
    public double annualProductionBonus;

    public ShiftSupervisor() {

    }

    public ShiftSupervisor(double annualSalary, double annualProductionBonus) {
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }
}
