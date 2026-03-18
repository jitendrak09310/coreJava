package Alpha.MultiDimensionArray;

public class TransposeMatrix {

    public static void transposeMatrix(String[][] matrix) {

        String transposedMatrix[][] = new String[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String matrix[][] = { { "a11", "a12", "a13" }, { "a21", "a22", "a23" } };

        transposeMatrix(matrix);
    }
}
