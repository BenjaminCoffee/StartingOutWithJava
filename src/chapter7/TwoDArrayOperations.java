package chapter7;

public class TwoDArrayOperations {
    //region Get the sum of all values in a 2 dimensional array.
    public static int getTotal(int[][] twoDArr) {
        int sum = 0;
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                sum = sum + twoDArr[i][j];
            }
        }
        return sum;
    }

    public static double getTotal(double[][] twoDArr) {
        double sum = 0;
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                sum = sum + twoDArr[i][j];
            }
        }
        return sum;
    }
    //endregion

    //region Get the size of the 2 dimensional array,
    // the sum of the rows and columns.
    public static int getSize(int[][] twoDArray) {
        int size = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                size++;
            }
        }
        return size;
    }
    //endregion

    //region Get the average of all values in the
    // 2 d array.
    public static int getAverage(int[][] twoDArray) {
        int totalOfIndices = TwoDArrayOperations.getTotal(twoDArray);
        int totalIndices = TwoDArrayOperations.getSize(twoDArray);

        return totalOfIndices / totalIndices;
    }

    public static double getAverage(double[][] twoDArray) {
        double totalOfIndices = TwoDArrayOperations.getTotal(twoDArray);
        double totalIndices = twoDArray.length * twoDArray[0].length;

        return totalIndices / totalIndices;
    }
    //endregion

    public static int  getRowTotal(int[][] twoDArr, int rowIndex) {
        int rowTotal = 0;
        for (int i = 0; i < twoDArr[rowIndex].length; i++) {
            rowTotal = rowTotal + twoDArr[rowIndex][i];
        }
        return rowTotal;
    }

    public static int getColumnTotal(int[][] twoDArr) {
        int colTotal = 0;
        for (int i = 0; i < twoDArr.length; i++) {
            colTotal = colTotal + twoDArr[i][0];
        }
        return colTotal;
    }

    public static int getHighestInRow(int[][] twoDArr, int rowIndex) {
        int highestInRow = twoDArr[0][0];
        for (int i = 0; i < twoDArr[rowIndex].length; i++) {
            if (twoDArr[rowIndex][i] > highestInRow) {
                highestInRow = twoDArr[rowIndex][i];
            }
        }
        return highestInRow;
    }

    public static int getLowestInRow(int[][] twoDArr, int rowIndex) {
        int lowestInRow = twoDArr[0][0];
        for (int i = 0; i < twoDArr[rowIndex].length; i++) {
            if (twoDArr[rowIndex][i] < lowestInRow) {
                lowestInRow = twoDArr[rowIndex][i];
            }
        }
        return lowestInRow;
    }

}
