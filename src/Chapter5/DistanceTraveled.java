package Chapter5;

import Chapter2.AskUserForInput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DistanceTraveled {
    private int mph;
    private int hours;

    /*
    public DistanceTraveled() {
        inputMphAndHours();
    }

     */
    public void testWrapper() {
        displayTravelStats();
    }
    public void inputMphAndHours() {
        setMph(AskUserForInput.askUserForPositiveInteger(
                "Please enter the mph(an integer greater than 0)."
        ));
        setHours(AskUserForInput.askUserForPositiveInteger(
                "Please Enter the hours(an integer greater than 0)."
        ));
    }
    // This method was added as part of Programming Challenge #4.
    public void writeToTheFile()
            throws FileNotFoundException {
        writeToDistanceTraveledDotTxt(
                "C:\\Users\\benja\\IdeaProjects" +
                        "\\StartingOutWithJava\\TextFiles\\Chapter5",
                "distanceTraveled.txt");
    }
    // This method was added as part of Programming Challenge #3.
    public void writeToDistanceTraveledDotTxt(String directoryPath, String newFileName)
            throws FileNotFoundException {
        PrintWriter writeToFile =
        HelpfulMethodsForFileIO.
                createNewFileAndWriteToIt(directoryPath, newFileName);

        int speed = getMph();
        for (int k = 0; k < 1; k++) {
            writeToFile.print("Hour");
            writeToFile.print("  ");
            writeToFile.print("Distance Traveled");
            for (int i = 1; i <= getHours(); i++) {
                writeToFile.print(i);
                writeToFile.print("  ");
                writeToFile.print(speed);
                speed = speed + getMph();
                writeToFile.println();
            }
            writeToFile.println("The vehicle traveled a total of " +
                    getDistance() + " miles.");

            // Always remember to close the PrintWriter object.
            writeToFile.close();
        }

    }
    public void displayTravelStats() {
        int speed = getMph();
        for (int k = 0; k < 1; k++) {
            System.out.print("Hour");
            System.out.print("  ");
            System.out.println("Distance Traveled");
            for (int i = 1; i <= getHours(); i++) {
                System.out.print(i);
                System.out.print("  ");
                System.out.print(speed);
                speed = speed + getMph();
                System.out.println();
            }
            System.out.print("The vehicle traveled a total of ");
            System.out.println(getDistance()+ " miles");
        }
    }

    public int getDistance() {
        return getMph() * getHours();
    }

    public int getMph() {
        return mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
