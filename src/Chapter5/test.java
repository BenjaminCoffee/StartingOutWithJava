package Chapter5;

import Chapter2.AskUserForInput;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
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
        for(int rows = 0; rows < 2; rows++ ) {
            for(int columns=0; columns < 8; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 8; i++) {

        }


        /*
         * PrintWriter object - creates a file and writes data to it.
         *      will delete any file with that name already.
         *
         * FileWriter object - can add to an existing file.
         *      will find the file with its name passed to it.
         */

    }
}
