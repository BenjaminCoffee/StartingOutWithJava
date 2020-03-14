package chapter3;

public class PayRollDriver {
    public static void main(String[] args) {
        payEmployee();
    }

    public static void payEmployee() {
        PayRoll payCheck0 = new PayRoll(
                "Smith", 4455
        );

        // Ask user for the pay rate of the employee
        // Store the result of the answer in the hourlyWage field.
        payCheck0.askForRate();

        // Ask user for the hours worked by the employee
        // Store the result of the answer in the numHoursWorked field.
        payCheck0.askForHours();

        System.out.println("Employee, '"+payCheck0.getName()+
                "', "+"'"+ payCheck0.getIdNumber()+
                "'"+ " has worked "+ payCheck0.getNumHoursWorked()+
                " hours, at a rate of "+ payCheck0.getHourlyWage()+
                "$ per hour.");
        System.out.println("The gross pay of payCheck0 = $"+
                payCheck0.getGrossPay());
    }
}
