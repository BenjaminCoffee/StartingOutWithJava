package chapter7;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] intArray = {8, 6, 7, 5, 3, 0, 9};
        float[] floatArray = {867530900, 867, 530, 90, 540, 360, 720};
        double[] doubleArray = {3.14, 8.67, 5.3, 0.9, 5.0, 6.0, 7.0};
        long[] longArray = {1234567, 7654321, 345678, 987654321, 777777777};

        System.out.println(getTotal(intArray));
        System.out.println(getAverage(longArray));
        System.out.println(getHighest(floatArray));
        System.out.println(getLowest(doubleArray));
    }

    //region get the total of all values in an array.
    public static int getTotal(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public static float getTotal(float[] arr) {
        float total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public static double getTotal(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public static long getTotal(long[] arr) {
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }
    //endregion

    //region get the average of all values in an array.
    public static int getAverage(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total / arr.length;
    }

    public static float getAverage(float[] arr) {
        float total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total / arr.length;
    }

    public static double getAverage(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total / arr.length;
    }

    public static long getAverage(long[] arr) {
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total / arr.length;
    }
    //endregion

    //region get the highest value in an array
    public static int getHighest(int[] arr) {
        int highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }

    public static float getHighest(float[] arr) {
        float highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }

    public static double getHighest(double[] arr) {
        double highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }

    public static long getHighest(long[] arr) {
        long highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }
    //endregion

    //region get the lowest value in an array
    public static int getLowest(int[] arr) {
        int lowest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        return lowest;
    }

    public static float getLowest(float[] arr) {
        float lowest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        return lowest;
    }

    public static double getLowest(double[] arr) {
        double lowest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        return lowest;
    }

    public static long getLowest(long[] arr) {
        long lowest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        return lowest;
    }
    //endregion
}
