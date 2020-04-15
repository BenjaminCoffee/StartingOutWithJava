package chapter7;

public class LargerThanN {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 8, 10, 12, 14};
        int n = 2;

        displayLargerThanN(arr, n);
    }

    public static void displayLargerThanN(int[] arr, int n) {
        // display all numbers in the array that are larger than n
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                System.out.println(arr[i]);
            }
        }
    }
}
