package Alpha.MultiDimensionArray;

public class DiagnalSum {

    public static void diagnalSum(int matrix[][]) {

        // for Finding diagonal sum n will always be equal to n;
        // primary diagonal sum = (i==j)
        // secodary sum -- i+j = n-1;

        int n = matrix.length;
        int sum = 0;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if ((i + j) == n - 1) {
        // sum += matrix[i][j];
        // }

        // }

        // }

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];// becoz for primary diagonal sum i ==j

            if (i != n - i - 1) {// should not be 2,2,3,3
                sum += matrix[i][n - i - 1];// becoz for sd sum i+j = n-1;
            }

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }

        };

        diagnalSum(matrix);
    }
}
