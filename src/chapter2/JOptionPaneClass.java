package chapter2;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This program will take input from a user using JOptionPane
 *
 * @author Benjamin Pannell
 * @version 1.0.0
 */

public class JOptionPaneClass {
    private String JOPString;
    private int age;

    /**
     * This method will display a message dialog box
     */
    public void displayMessageDialog() {
        JOPString = ("Greetings, Earthlings!");
        JOptionPane.showMessageDialog(null, JOPString);
    }

    /**
     * This method will display an input dialog box and store the input in
     * a String field - 'JOPString'.
     */
    public void displayInputDialog() {
        JOPString = ("Please enter your name.");
        JOPString = JOptionPane.showInputDialog(JOPString);
    }

    /**
     * This method echos the value of 'JOPString' to the user
     * The user is prompted to confirm the data is valid by pressing 'Y' or
     * given another chance to input their name by calling the 'displayInputDialog' method by pressing 'N'.
     * Any other input other than 'Y' or 'N' will result in the prompt display again.
     */
    public void validateInput() {
        Scanner in = new Scanner(System.in);
        String input = new String();
        do {
            System.out.println("You entered '" + JOPString + "' in the dialog box.");
            System.out.println("Is this correct?");
            System.out.println("Press 'Y' or 'N'.");
            input = in.nextLine();
            if (input.equalsIgnoreCase("N")) {
                displayInputDialog();
            }
        }while(!input.equalsIgnoreCase("Y"));

        //Its always nice to thank the user.
        System.out.println("Thank you!");
    }

    /**
     * This method displays an input dialog box.
     * The user prompt will be repeated until a string containing an integer is typed in.
     * If the string is empty or does not contain an integer, the prompt will continue to loop
     * until valid data is entered.
     */
    public void displayInputDialogForAge() {
        String str;
        do {
            str = JOptionPane.showInputDialog("Please enter your age.");
        }while(str.isEmpty() || str.isBlank() || !stringContainsNumber(str));
        String numberOnly= str.replaceAll("[^0-9]", "");
        age = Integer.parseInt(numberOnly);
    }

    /**
     * This method receives a string and determines whether nor not it contains a number.
     * @param s - The String to be evaluated
     * @return a boolean value - true if string contains a number.
     *                         - false if the string does not contain a number.
     */
    public boolean stringContainsNumber( String s )
    {
        Pattern p = Pattern.compile( "[0-9]" );
        Matcher m = p.matcher( s );

        return m.find();
    }

    /**
     * This method echos the value of 'age' to the user
     * The user is prompted to confirm the data is valid by pressing 'Y' or
     * given another chance to input their name by calling the 'displayInputDialogForAge' method by pressing 'N'.
     * Any other input other than 'Y' or 'N' will result in the prompt display again.
     */
    public void validateInputAge() {
        Scanner in = new Scanner(System.in);
        String input;

        do {
            System.out.println("You entered '" + age + "' for your age.");
            System.out.println("Is this correct?");
            System.out.println("Press 'Y' or 'N'.");
            input = in.nextLine();
            if (input.equalsIgnoreCase("N")) {
                displayInputDialogForAge();
            }
        }while(!input.equalsIgnoreCase("Y"));

        //Its always nice to thank the user : )
        System.out.println("Thank you!");
    }

    /**
     * This method terminates the program. It is necessary when using JOptionPane.
     */
    public void terminateProgram() {
        System.exit(0);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
