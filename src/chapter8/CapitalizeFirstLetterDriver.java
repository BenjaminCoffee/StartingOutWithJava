package chapter8;

public class CapitalizeFirstLetterDriver {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        String testString = "hello. my name is Joe. what is your name?";
        CapitalizeFirstLetter capitalizeFirstLetter =
                new CapitalizeFirstLetter(testString);
        System.out.println(capitalizeFirstLetter.getString());
    }
}
