package chapter6;

public class Test {
    public static void main(String[] args) {
        String testString = "hello";
        changeTheString(testString);

        System.out.println(testString);

    }
    public static void changeTheString(String str) {
        str = "Changed";
    }
}
