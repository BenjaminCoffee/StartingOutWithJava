package Chapter4;

import Chapter2.AskUserForInput;

public class BookClubPoints {
    private int books;

    public BookClubPoints(int books) {
        this.books = books;
    }
    public String statement() {
        if (getBooks() != 1)
        return " You have purchased "+
                getBooks()+ " books and earned a total of "+
                getPoints()+ " points.";

        // singular version of 'book' for proper grammar if the numbers of books = 1
        else return " You have purchased "+
                getBooks()+ " book and earned a total of "+
                getPoints()+ " points.";
    }

    public int getPoints() {
        if (getBooks() == 0)
            return 0;
        else if (getBooks() == 1)
            return 5;
        else if (getBooks() == 2)
            return 15;
        else if (getBooks() == 3)
            return 30;
        else return 60;
    }

    /*
    public void inputBooks() {
        setBooks(askForBooks());
    }

     */

    public static int askForBooks() {
        int userInput;

        do {
            userInput =
                    AskUserForInput.askUserForInteger(
                            "Enter the amount of books purchased."
                    );
            if(userInput < 0) {
                System.out.println("The number may not be negative.");
            }
        } while(userInput < 0);

        return userInput;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }
}