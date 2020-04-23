package chapter7;

import java.util.Random;

public class ModifiedSearchAlgorithmsDriver {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        int[] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        Random randomObj = new Random();
        /*

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = randomObj.nextInt(8);
        }

         */
        System.out.println("Sequential Search algorithm benchmark test: ");
        System.out.println(ModifiedSearchAlgorithms.sequentialSearch(intArr, 4));
        System.out.println(ModifiedSearchAlgorithms.sequentialSearch(intArr, 6));
        System.out.println(ModifiedSearchAlgorithms.sequentialSearch(intArr, 8));
        System.out.println(ModifiedSearchAlgorithms.sequentialSearch(intArr, 10));
        System.out.println(ModifiedSearchAlgorithms.sequentialSearch(intArr, 14));
        System.out.println();
        System.out.println("Binary search algorithm benchmark test: ");
        System.out.println(ModifiedSearchAlgorithms.binarySearch(intArr, 4));
        System.out.println(ModifiedSearchAlgorithms.binarySearch(intArr, 6));
        System.out.println(ModifiedSearchAlgorithms.binarySearch(intArr, 8));
        System.out.println(ModifiedSearchAlgorithms.binarySearch(intArr, 10));
        System.out.println(ModifiedSearchAlgorithms.binarySearch(intArr, 14));

    }
}
