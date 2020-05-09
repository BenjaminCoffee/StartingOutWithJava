package chapter8;

public class DisplayStringBackwardsDriver {
    public static void main(String[] args) {
       demonstration();
    }

    public static void demonstration() {
        DisplayStringBackwards displayStringBackwards =
                new DisplayStringBackwards("Goober");
        System.out.println(displayStringBackwards.getString());
    }
}
