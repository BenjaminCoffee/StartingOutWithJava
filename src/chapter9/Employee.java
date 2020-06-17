package chapter9;

import java.util.regex.Pattern;

public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (Pattern.matches("[0-9][0-9][0-9]-[A-M]", employeeNumber)) {
            this.employeeNumber = employeeNumber;
        }
        else {
            System.out.println("Invalid input for employeeNumber field.");
            System.out.println("employeeNumber field has not been set.");
        }
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        if (Pattern.matches("[0-12]-[0-31]-[2][0-9][0-9][0-9]", hireDate)) {
            this.hireDate = hireDate;
        } else {
            System.out.println("Invalid input for hire date. " +
                    "hireDate field not set.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }

}
