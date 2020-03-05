package Chapter5;

import Chapter2.AskUserForInput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        /*
        int x = 8, y;

        y = x--;

        System.out.println(x);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x);

         */

        /*
        Scanner keyboard = new Scanner(System.in);

        int z;
        z = keyboard.nextInt();
        while(z < 10 || z > 25) {
            System.out.println("The number you entered is out of range.");
            System.out.println("Please try again.");
            z = keyboard.nextInt();
        }

        System.out.println("The number you entered is "+ z);

         */

        /*
        int i;

        for(i=1; i <=49; i++) {
            if (i % 2 !=0) {
                System.out.println(i);
            }
        }

        for(i = 0; i <= 100; i++) {
            if(i%5 == 0) {
                System.out.println(i);
            }
        }

         */
        /*
        int sum = 0;
        for(int i=0; i < 7; i++) {
            sum =+AskUserForInput.
                    askUserForInteger("Enter number"+(i)+ ": ");
        }

         */

        /*
        for(int rows = 0; rows < 2; rows++ ) {
            for(int columns=0; columns < 8; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 8; i++) {

        }

         */


        /*
         * PrintWriter object - creates a file and writes data to it.
         *      will delete any file with that name already.
         *
         * FileWriter object - can add to an existing file.
         *      will find the file with its name passed to it.
         */

        /*
        // create a file object to reference the testTextFile.
        File theTestTextFile = new File(
                "C:\\Users\\benja\\IdeaProjects\\" +
                        "StartingOutWithJava\\TextFiles\\Chapter5\\testTextFile");

        // Creating a FileWriter object so the file can be appended to without
        // being deleted.
        FileWriter writingToTestFile = new FileWriter(theTestTextFile, true);

        // A Print Writer object is still needed to write data to a file.
        PrintWriter writeToTestFile = new PrintWriter(writingToTestFile);

        // Append a second line to testTextFile.txt.
        writeToTestFile.println("This is the second line.");
        writeToTestFile.close();

        // Create a scanner object to read data from the test file
        // Pass a File object as an argument to reference the testTextFile.
        Scanner readFromFile = new Scanner(theTestTextFile);

        while(readFromFile.hasNext()) {
            System.out.println(readFromFile.nextLine());
        }

        // close the connection
        readFromFile.close();

         */

        // 1.
        /*
        int userEnteredNum;
        int product;

        System.out.println("Enter a number");
        userEnteredNum = in.nextInt();
        product = userEnteredNum * 10;

        while(product < 100) {
            System.out.println("Enter a number");
            userEnteredNum = in.nextInt();
            product = userEnteredNum * 10;
            System.out.println(product);
        }

         */

        //2.
        /*
        int num;
        String userResponse;

        do {
            System.out.println("Enter the first number:");
            num = in.nextInt();

            System.out.println("Enter the second number:");
            num = num + in.nextInt();
            in.nextLine();

            System.out.println("The sum of the two numbers = " + num);
            System.out.println("would you like to continue?");
            do {
                System.out.println("Press 'Y' or 'N");
                userResponse = in.nextLine();
                if (!userResponse.equalsIgnoreCase("n") &&
                        !userResponse.equalsIgnoreCase("y")) {
                    System.out.println("You did not enter 'Y' or 'N', try again.");
                }
            } while (!userResponse.equalsIgnoreCase("n") &&
                    !userResponse.equalsIgnoreCase("y"));

        } while (userResponse.equalsIgnoreCase("Y"));

         */

        // 3.
        /*
        for(int i = 0; i <= 1000; i += 10) {
            System.out.println(i);
        }

         */

        // 4.
        /*
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            sum = sum + in.nextInt();
        }
        System.out.println("The total of the numbers = "+ sum);

         */

        // 5.
        /*
        int sum = 0;
        System.out.println(sum);
        for(int i = 130; i <= 301; i += 99) {
            sum = sum + i;
        }
        System.out.println(sum);

         */

        // 6.
        /*
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 15; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

         */

        // 7.
        /*
        for(int j = 8; j != 0; j--) {

            for (int i = j; i != 0; i--) {
                System.out.print("*");
            }

            System.out.println();
        }

         */

        // 8.
        /*
        for(int i = 1; i < 8; i++) {
            System.out.print("#");
            for(int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }

        */
        // 9.
        /*
        for(int i = 0; i < 10; i++) {
            Random randomNum = new Random();
            if(randomNum.nextInt(2) == 1) {
                System.out.println("Yes");
            }
            else System.out.println("No");
        }

         */
        // 10.
        /*
        Scanner keyboard = new Scanner(System.in);
        int x = 1;
        do {
            System.out.println("Enter a number:");
            x = keyboard.nextInt();
        }while(x > 0);

         */

        // 11.
        /*
        String input;
        char sure;

        System.out.println("Are you sure you want to exit?");
        input = in.next();
        sure = input.charAt(0);
        while( sure != 'Y' && sure != 'N') {
            System.out.println("You did not enter valid data");
            input = in.next();
            sure = input.charAt(0);
        }
        System.out.println(sure);

         */

        // 12.
        /*
        for (int count = 0; count < 50; count++) {
            System.out.println("count is " + count);
        }

         */

        // 13.
        /*
        int x = 50;

        while(x > 0) {
            System.out.println(x + " seconds to go.");
            x--;
        }

         */

        // 14.
        /*
        int num = 0;
        do {
            System.out.println("Enter a number between"+
                    " 1 and 5.");
            num = in.nextInt();

            if(num > 5 || num < 1) {
                System.out.println("That number is invalid.");
            }
        }while(num > 5 || num < 1);

         */

        // 15.
        /*
        String input;

        do {
            System.out.println("Please enter 'yes' or 'no'");
            input = in.nextLine();
            if (!input.equalsIgnoreCase("no")
                    &&
                    !input.equalsIgnoreCase("yes")) {
                System.out.println("You did not enter 'yes' or 'no");
            }
        } while (!input.equalsIgnoreCase("no")
                &&
                !input.equalsIgnoreCase("yes"));
        System.out.println(input);

         */

        // 16.
        // create a file object to specify a folder.
        File dirName = new File(
                "C:\\Users\\benja\\IdeaProjects" +
                        "\\StartingOutWithJava\\ChapterSpecificFiles\\Chapter5");
        // if the specified directory does not exist, the program will terminate.
        if(!dirName.exists()) {
            System.out.println("The specified directory path does not exist.");
            System.out.println("The program will now terminate after you press enter.");
            in.nextInt();
            System.exit(0);
        }

        // Create another File object
        // This time the file object referencing a directory name will be passed
        // as the first argument in a new File object constructor.
        // The second argument will be the name of the file.
        File theFile = new File(dirName, "numberList.txt");

        // If we pass theFile to a PrintWriter object,
        // a file will be created in the specified directory.
        // if the file already exists, it will be deleted and a new
        // text file will be created.
        // the following if statement will account for this potential problem.

        if(theFile.exists()) {
            System.out.println("The File you specified already exists.");
            System.out.println("Continuing will delete the previous file and replace"+
                    " it with the new file.");
            boolean response =
                    AskUserForInput.askUserYesOrNo(
                            "Would you like to continue?");
            if(!response) {
                System.out.println("You do not wish to continue");
                System.out.println("The program will now terminate after pressing enter");
                in.nextLine();
                System.exit(0);
            }
        }
        PrintWriter createAndWrite = new PrintWriter(theFile);
        for(int i = 1; i <= 100; i++) {
            createAndWrite.println(i);
        }
        createAndWrite.close();



        // 17.
        // We now want to read from the previously created file.
        // We will pass theFile(the variable referencing the previously created
        // numberList.txt) to a Scanner object.
        Scanner readFromNumberListFile = new Scanner(theFile);

        //create a while loop to read all the lines in the file
        // until there are no more lines.
        /*
        while(readFromNumberListFile.hasNext()) {
            System.out.println(readFromNumberListFile.nextLine());
        }

         */



        // 18.
        int sum = 0;

        while (readFromNumberListFile.hasNext()) {
            sum = sum + readFromNumberListFile.nextInt();
            System.out.println(readFromNumberListFile.nextInt());
        }
        System.out.println(" = " + sum);
        readFromNumberListFile.close();

        // 19.
        // We now want to append some data to the end of numberList.txt
        // without deleting the file and creating a new one.
        // We can do this by passing a FileWriter object through a
        // PrintWriter object.

        // We must first create the FileWriter object to be passed
        // as an argument.
        // We pass the same File object(theFile) we've been using.
        FileWriter fileToBeAppended = new FileWriter(theFile, true);

        // pass the FileWriter object to a new PrintWriter object
        PrintWriter appendToFile = new PrintWriter(fileToBeAppended);
        appendToFile.println("This line was added as part of algorithm" +
                " work bench # 19.");

        appendToFile.close();
    }
}
