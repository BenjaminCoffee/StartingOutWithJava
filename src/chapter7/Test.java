package chapter7;

import chapter2.AskUserForInput;

public class Test {
    public static void main(String[] args) {
        // 7.1
        int[] employeeNumbers = new int[100];

        // 7.2
        double[] payRate = new double[25];

        // 7.3
        float[] miles = new float[14];

        // 7.4
        char[] letters = new char[1000];

        // 7.7
        // 1
        // 2
        // 3
        // 4
        // 5

        // 7.8
        double[] doubleArr = {1.7, 6.4, 8.9, 3.1, 9.2};

        for(double val : doubleArr)
            System.out.println(val);

        // 7.10
        int[] arrVar = {3, 2, 1};
        for (int i = 0; i < arrVar.length; i++) {
            arrVar[i] = -1;
            System.out.println("i = " + i);
            System.out.println("arrVar" + "[" + i + "] = " + arrVar[i] + "\n");
        }

        // 7.11
        /*
        int answer = AskUserForInput.askUserForPositiveInteger("Enter the size of the array");
        int[] arr = new int[answer];

         */

        // 7.12
        final int ARRAY_SIZE = 7;
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int[] b = new int[ARRAY_SIZE];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        for (int var : b) {
            System.out.println(var);
        }

        // 7.13
        final int ARRAY_SIZE0 = 100;
        double[] numbers = new double[ARRAY_SIZE0];
        myMethod(numbers);

        int[] testingSomething = new int[10];
        testingSomething[0] = 14;
        System.out.println(testingSomething[0]);
        System.out.println(testingSomething[1]);

        String[] strArray = new String[10];
        System.out.println(strArray[0]);

        String[] planetsArray = new String[]{"Earth", "Venus", "Mars", "Jupiter"};
        for (int i = 0; i < planetsArray.length; i++) {
            System.out.println(planetsArray[i].charAt(0));
        }

        //7.16
        Rectangle[] recArray = new Rectangle[5];
        for (int i = 0; i < recArray.length; i++) {
            recArray[i] = new Rectangle(3, 7);
        }



    }



    // created for 7.13
    public static void myMethod(double[] array) {
        for (double index : array) {
            System.out.println(index);
        }
    }

    // created for 7.14
    public static void zero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void sortArray(int[] arr) {
        int lowest = arr[0];
        int container = 0;
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        container = arr[arr.length - 1];



    }
}
