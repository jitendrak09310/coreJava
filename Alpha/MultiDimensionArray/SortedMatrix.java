package Alpha.MultiDimensionArray;

public class SortedMatrix {

    public static boolean stairCaseSearch(int matrix[][], int key) {

        // int row = 0, col = matrix.length - 1;

        // while (row < matrix.length && col >= 0) {
        // if (matrix[row][col] == key) {
        // System.out.println("key found at (" + row + " " + col + ")");
        // return true;
        // } else if (matrix[row][col] > key) {
        // col--;
        // } else {
        // row++;
        // }
        // }
        // return false;

        int row = matrix[0].length - 1, col = 0;

        while (col < matrix.length && row >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at (" + row + " " + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col++;
            } else {
                row--;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }

        };

        boolean result = stairCaseSearch(matrix, 16);

        System.out.println(result);
    }
}
