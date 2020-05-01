package chapter7;


public class LoShuMagicSquare {

    public static void main(String[] args) {
        int[][] arr = {
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}
        };

        System.out.println("Top row sum = " + sumTopRow(arr));
        System.out.println("Left column sum = "+ sumLeftCol(arr));
        System.out.println("Bottom row sum = "+ sumBottomRow(arr));
        System.out.println("Right column sum = " + sumRightColumn(arr));
        System.out.println("Diagonal(top left to bottom right) sum = "+
                sumDiagonalTopLeftToBottomRight(arr));
        System.out.println("Diagonal(top right to bottom left) sum = " +
                sumDiagonalTopRightBottomLeft(arr));

        System.out.println("Is the square magic? --> " + isSquareMagic(arr));
    }
    public static boolean isSquareMagic(int[][] twoDArr) {

        int topRow = sumTopRow(twoDArr);
        int leftColumn = sumLeftCol(twoDArr);
        int bottomRow = sumBottomRow(twoDArr);
        int rightColumn = sumRightColumn(twoDArr);
        int diagonalFromTopLeftToBottomRight = sumDiagonalTopLeftToBottomRight(twoDArr);
        int diagonalFromTopRightToBottomLeft = sumDiagonalTopRightBottomLeft(twoDArr);

        if
        (topRow == leftColumn
                &&
                topRow == bottomRow
                &&
                topRow == rightColumn
                &&
                topRow == diagonalFromTopLeftToBottomRight
                &&
                topRow == diagonalFromTopRightToBottomLeft) {
            return true;
        }

        return false;
    }

    public static int sumDiagonalTopRightBottomLeft(int[][] twoDArr) {
        int sum = 0;

        // top right index of the square
        int topRightIndex = twoDArr[0][twoDArr[0].length - 1];

        // middle index of the square
        int middleIndex = twoDArr[twoDArr.length / 2][twoDArr[twoDArr.length / 2].length / 2];

        // bottom left index of the square
        int bottomLeftIndex = twoDArr[twoDArr.length - 1][0];

        sum = topRightIndex + middleIndex + bottomLeftIndex;

        return sum;
    }

    public static int sumDiagonalTopLeftToBottomRight(int[][] twoDArr) {
        int sum = 0;

        // top left index of square
        int topLeftIndex = twoDArr[0][0];

        // middle index of the square
        int middleIndex = twoDArr[twoDArr.length / 2][twoDArr[twoDArr.length / 2].length / 2];

        // bottom right index of the square
        int bottomRightIndex = twoDArr[twoDArr.length - 1][twoDArr[twoDArr.length - 1].length - 1];

        sum = topLeftIndex + middleIndex + bottomRightIndex;

        return sum;
    }

    public static boolean isSizeAppropriate(int[][] twoDArr) {
        int appropriateSize = 9;
        if (appropriateSize == TwoDArrayOperations.getSize(twoDArr)) {
            return true;
        }
        return false;
    }

    public static int sumLeftCol(int[][] twoDArr) {
        int sum = 0;
        for (int i = 0; i < twoDArr.length; i++) {
            sum = sum + twoDArr[i][0];
        }
        return sum;
    }

    public static int sumBottomRow(int[][] twoDArr) {
        int sum = 0;
        for (int i = 0; i <twoDArr[twoDArr.length - 1].length ; i++) {
            sum = sum + twoDArr[twoDArr.length - 1][i];
        }
        return sum;
    }

    public static int sumRightColumn(int[][] twoDArr) {
        int sum = 0;
        for (int i = 0; i < twoDArr.length; i++) {
            sum = sum + twoDArr[i][twoDArr[i].length - 1];
        }
        return sum;
    }

    public static int sumTopRow(int[][] twoDArr) {
        int sum = 0;
        for (int i = 0; i < twoDArr[0].length; i++) {
            sum = sum + twoDArr[0][i];
        }
        return sum;
    }
}
