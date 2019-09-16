package Chapter3;

import Chapter2.AskUserForInput;

public class CircleDriver {
    public static void main(String[] args) {
        circleDemo();
    }
    public static void circleDemo() {
        Circle circle0 = new Circle(
                AskUserForInput.askUserForDouble(
                        "Please enter the radius of the circle."
                )
        );

        System.out.print("The diameter of the circle is ");
        System.out.println(circle0.getDiameter());

        System.out.print("The area of the circle is ");
        System.out.println(circle0.getArea());

        System.out.print("The circumference of the circle is ");
        System.out.println(circle0.getCircumference());
    }
}
