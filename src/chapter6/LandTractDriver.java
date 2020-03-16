package chapter6;

public class LandTractDriver {
    public static void main(String[] args) {
        LandTract tract0 = new LandTract(5, 10);
        LandTract tract1 = new LandTract(10, 5);

        // show the area of tract0
        System.out.println(tract0.getArea());

        // show the are of tract1
        System.out.println(tract1.getArea());

        // display the methods toString methods
        System.out.println(tract0.toString());
        System.out.println(tract1.toString());

        // are the objects fields equal?
        System.out.println(tract0.equals(tract1));

        // although their fields are not equal, their area methods
        // return the same number.
        System.out.println(tract0.isAreaEqual(tract1));
    }
}
