package Chapter3;

import Chapter2.AskUserForInput;

public class EmployeeDriver {
    //driver
    public static void main(String [] args) {
        threeEmployees();
    }

    //static methods.
    public static void threeEmployees() {

        Employee employee0 = new Employee(
                "Susan Meyers",
                "Accounting",
                "Vice President",
                47899);

        Employee employee1 = new Employee(
                "Mark Jones",
                "IT",
                "Programmer",
                39119);

        Employee employee2 = new Employee(
                "Joy Rogers",
                "Manufacturing",
                "Engineer",
                81774);

        System.out.println(employee0.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}


