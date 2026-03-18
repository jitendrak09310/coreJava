package Alpha.Arrays;

public class SpiralMatrix {

    public static void printSprialMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {

            // top-- row fix column variable.
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right -- row variable increasing and column fixed.
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom -- row fixed and column decreasing.
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
                if (startRow == endRow) {
                    break;
                }

            }

            // left -- for column fixed and row changed.
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
                if (startCol == endCol) {
                    break;
                }

            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

    }

    public static void main(String[] args) {

        // int matrix[][] = {
        // { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 },
        // { 21, 22, 23, 24, 25 }

        // };

        int matrix[][] = {
                { 1, 2, 3 }, { 4, 5, 6 },
                { 7, 8, 9 }

        };

        printSprialMatrix(matrix);

    }
}
