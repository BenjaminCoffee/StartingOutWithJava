package Chapter4;

public class BookClubPointsDriver {
    public static void main(String[] args) {
        bookClubPointsDemo();
    }

    public static void bookClubPointsDemo() {
        BookClubPoints account0;
        account0 = new BookClubPoints(BookClubPoints.askForBooks());

        System.out.println(account0.statement());
    }
}
