package chapter6;

/**
 * This class is a test area for different concepts introduced in chapter 6.
 */
public class Test {

    /**
     * Entry point to application
     * @param args
     */
    public static void main(String[] args) {

        // Although Strings are objects in java, they are NOT passed by reference
        // Strings are immutable, after they are created tey can not be changed.
        String testString = "hello";
        changeTheString(testString);

        System.out.println(testString);

        String myString = "goop";

    }
    public static void changeTheString(String str) {
        str = "Changed";
    }
}
