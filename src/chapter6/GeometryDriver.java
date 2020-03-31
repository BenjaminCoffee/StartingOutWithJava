package chapter6;

import chapter2.AskUserForInput;

import java.util.Scanner;

public class GeometryDriver {
    public static void main(String[] args) {
        demonstration();
    }
    public static void demonstration() {

        while(true) {
            displayChoices();

            int selection = askUserForSelection();

            handleSelection(selection);

            if (selection == 4) {
                break;
            }
        }


    }

    public static void handleSelection(int answer) {
        switch (answer) {
            case 1 :
                returnAreaCircleMethod();
                break;
            case 2 :
                returnAreaRectangleMethod();
                break;
            case 3 :
                returnAreaTriangleMethod();
                break;
            case 4 :
                exitProgram();
        }
    }
    public static int askUserForSelection() {
        int answer = 0;
        do  {
            answer = AskUserForInput.askUserForInteger(
                    "Please enter a number between 1 - 4");
            if(answer < 1 || 4 < answer) {
                System.out.println("Invalid selection.");
            }
        }while(answer < 1 || 4 < answer);

        return answer;
    }

    public static void exitProgram() {
        System.out.println("You have selected to quit.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Press enter to quit.");
        keyboard.nextLine();
    }
    public static void returnAreaTriangleMethod() {
        System.out.println("You have selected area of a triangle.");
        double base =
                AskUserForInput.askUserForDouble(
                        "Please enter the base of the triangle"
                );
        double height =
                AskUserForInput.askUserForDouble(
                        "Please enter the height of the triangle"
                );
        System.out.print("The area of that triangle = ");
        System.out.println(Geometry.areaTriangle(base, height));
    }

    public static void returnAreaRectangleMethod() {
        System.out.println("You have selected area of a rectangle.");
        double length =
                AskUserForInput.askUserForDouble(
                        "Please enter the length of the rectangle"
                );
        double width =
                AskUserForInput.askUserForDouble(
                        "Please enter the width of the rectangle"
                );
        System.out.print("The area of that circle = ");
        System.out.println(Geometry.areaRectangle(length, width));
    }

    public static void returnAreaCircleMethod() {
        System.out.println("You have selected area of a circle.");
        double radius =
                AskUserForInput.askUserForDouble(
                "Please enter the radius of the circle");
        System.out.print("The area of that circle = ");
        System.out.println(Geometry.areaCircle(radius));
    }

    public static void displayChoices() {
        System.out.println("Press 1 to calculate the area of a circle. \n");
        System.out.println("Press 2 to calculate the area of a rectangle \n");
        System.out.println("Press 3 to calculate the area of a triangle \n");
        System.out.println("Press 4 to exit the program.");
    }
}
