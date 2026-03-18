package Alpha.MultiDimensionArray;

import java.util.Scanner;

public class CreateMatrices {

    public static void largest(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

            }

        }
        System.out.println("max number is " + max);
    }

    public static void minimum(int matrix[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }

            }

        }
        System.out.println("min number is " + min);
    }

    public static void search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at " + i + " " + j);
                    return;
                }

            }

        }
        System.out.println("key not found!");
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];

        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        // search(matrix, 11);
        largest(matrix);
        minimum(matrix);

    }
}
