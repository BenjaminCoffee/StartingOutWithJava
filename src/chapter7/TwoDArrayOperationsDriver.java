package chapter7;

import java.lang.reflect.Array;

public class TwoDArrayOperationsDriver {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        int[][] twoDArray = {{1, 6, 2, 7}, {3, 2, 1}};
        System.out.println(TwoDArrayOperations.getTotal(twoDArray));
        System.out.println(TwoDArrayOperations.getAverage(twoDArray));
        System.out.println(TwoDArrayOperations.getRowTotal(twoDArray, 1));
        System.out.println(TwoDArrayOperations.getColumnTotal(twoDArray));
        System.out.println(TwoDArrayOperations.getHighestInRow(twoDArray, 1));
        System.out.println(TwoDArrayOperations.getLowestInRow(twoDArray, 1));
    }
}
