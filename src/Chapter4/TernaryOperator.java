package Chapter4;

public class TernaryOperator {
    public static void main(String[] args) {
        ternaryDemo();
    }

    public static void ternaryDemo() {
        int x = 25;
        int y = 15;
        int z = 20;

        if (x > y)
            z = 2;
        else
            z = 21;

        // Rewrite using the ternary operator
        z = (x > y) ? 2 : 21;

        System.out.println(z);
    }
}
