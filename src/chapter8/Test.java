package chapter8;

import chapter2.AskUserForInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
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

        int answer = AskUserForInput.askUserForPositiveInteger("Enter the size of the array");
        int[] arr = new int[answer];



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

        */

        /*
        int[] arr = new int[]{10, 2, 4, 1};
        selectionSort(arr);
        for (int var : arr) {
            System.out.println(var);
        }

         */

        /*
        Scanner sentence = new Scanner(new File("chapterSpecificFiles/chapter7/8_ball_responses"));
        ArrayList<String> sentenceList = new ArrayList<String>();

        while (sentence.hasNextLine())
        {
            sentenceList.add(sentence.nextLine());
        }

        sentence.close();
        String[] SENTENCE;
        String[] sentenceArray = sentenceList.toArray(new String[sentenceList.size()]);

        for (int r = 0; r < sentenceArray.length; r++) {
            SENTENCE = sentenceArray[r].split("(?<=[.!?])\\s*");
            for (int i = 0; i < SENTENCE.length; i++) {
                System.out.println("Sentence " + (i + 1) + ": " + SENTENCE[i]);
            }

        }
        // the first row of sentences is SEENTENCE[0]
        // the second row of SENTENCE is SENTENCE[1]

         */

        /*
        String testStr = "Squeeze the ger";
        System.out.println(endsWithGer(testStr));


         */

        String str = "/home/rjones/mydata.txt";
        printTokens(str);

        printTokensWithSplit(str);
        System.out.println();

        str = "dog$cat@bird%squirrel";

        printTokens0(str, "$@%");
        char a = 'A';
        System.out.println(Integer.toBinaryString(a));
        int fourteen = 14;
        System.out.println(Integer.toBinaryString(fourteen));

        String str0 = "894.56";
        double aDouble = Double.parseDouble(str0);
        System.out.println(aDouble);

        int i = 99;
        String intString = Integer.toString(i);
        System.out.println(intString);

        String str1 = "   This string has some spaces.";
        System.out.print("Number of white spaces in str1 = ");
        System.out.println(getWhiteSpaces(str1));

        String str2 = "Th1s str1ng h4s s0m3 d1g1t2";
        System.out.print("Number of digits in str2 = ");
        System.out.println(getDigits(str2));
        String testEmail = "123Goober@goobermail.cOm";
        System.out.println(endsWithDotCom(testEmail));

        String str3 = "cookies>milk>fudge:cake:ice cream";
        getTokens(str3);
        System.out.println();
        String[] strArr = str3.split("[>:]");
        for (String var :
                strArr) {
            System.out.println(var);

        }

        double d = Integer.MAX_VALUE;
        System.out.println(castDoubleToInt(d));

        i = 214;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toOctalString(i));

        str = "237.89";
        double value;

         value = Double.parseDouble(str);
        System.out.println(value);

    }

    public static int castDoubleToInt(double d) {
        int anInt = 0;
        if (d <= Integer.MAX_VALUE) {
            anInt = (int) d;
        }
        return anInt;
    }

    public static void getTokens(String string) {
        StringTokenizer tokenizer =
                new StringTokenizer(
                        string, ">:", false);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }

    public static StringBuilder replaceTWithT(StringBuilder strBuilder) {
        String str = strBuilder.toString();
        str = str.replace('t', 'T');
        strBuilder = new StringBuilder(str);

        return strBuilder;
    }

    public static boolean endsWithDotCom(String string) {
        //string = string.toLowerCase();
        if (string.toLowerCase().endsWith(".com".toLowerCase())) {
            return true;
        }
        return false;
    }
    public static int getDigits(String string) {
        int numOfDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                numOfDigits++;
            }
        }
        return numOfDigits;
    }
    public static int getWhiteSpaces(String string) {
        int numOfWhiteSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i))) {
                numOfWhiteSpaces++;
            }
        }

        return numOfWhiteSpaces;
    }

    public static void printTokens0(String string, String delimiter) {
        String[] strArr = string.split("[$@%]");
        for (String str :
                strArr) {
            System.out.println(str);
        }

    }

    public static void printTokensWithSplit(String string) {
        String[] strArr = string.split("[/.]");

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }

    public static void printTokens(String string) {
        StringTokenizer strTokenizer = new StringTokenizer(string, "/.");
        while (strTokenizer.hasMoreTokens()) {
            System.out.println(strTokenizer.nextToken());
        }
    }

    public static boolean endsWithGer(String string) {
        if (string.endsWith("ger".toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void selectionSort(int[] array) {
        int startScan, index, minIndex, minValue;

        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];

            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }

            array[minIndex] = array[startScan];
            array[startScan] = minValue;
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
