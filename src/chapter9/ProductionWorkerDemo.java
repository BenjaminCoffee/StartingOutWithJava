package chapter9;

import chapter2.AskUserForInput;

import java.util.regex.Pattern;

public class ProductionWorkerDemo {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        // an example of polymorphism
        // The employee variable is an Employee reference variable.
        // because the ProductionWorker class is a child of the Employee class,
        // the Employee class reference variable may reference a ProductionWorker object.
        // employee is a polymorphic variable.
        // Employee employee = new ProductionWorker();
        ProductionWorker employee = new ProductionWorker();

        inputDataToProductionWorker(employee);
        System.out.println(employee.toString());

    }

    public static void inputDataToProductionWorker(ProductionWorker worker) {

        worker.setName("Bob"/*AskUserForInput.askUserForString(
                "Enter employee name"
        )*/);
        worker.setEmployeeNumber("111-A"/*askForEmployeeNumber() */);
        worker.setHireDate("date");
        worker.setShift(1);
        worker.setPayRate(13.75);
    }

    public static String askForEmployeeNumber() {
        String userInput;
        boolean flag = false;
        do {
            userInput = AskUserForInput.askUserForString(
                    "Enter employee ID number"
            );
            if (Pattern.matches("[0-9][0-9][0-9]-[A-M]", userInput)) {
                flag = true;
            }
            else System.out.println("You did not enter a valid employee ID number.");
        } while (!flag);

        return userInput;
    }
}
