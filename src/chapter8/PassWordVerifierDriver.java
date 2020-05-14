package chapter8;

public class PassWordVerifierDriver {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        String testPassword = "P4ssword";
        System.out.println("Is the password valid? " +
                PassWordVerifier.isPasswordValid(testPassword));
    }
}
