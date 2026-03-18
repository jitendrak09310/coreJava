package Alpha.MultiDimensionArray;

public class FindNumCounts {

    public static int findCount(int arr[][]) {

        int count = 0;
        int n = arr.length;
        int m = arr[0].length;
        int key = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };

        int count = findCount(arr);
        System.out.println(count);
    }
}
