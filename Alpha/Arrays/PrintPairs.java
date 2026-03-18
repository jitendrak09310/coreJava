package Alpha.Arrays;

public class PrintPairs {

    public static void printPairs(int arr[]) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int curr = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 10 };
        printPairs(arr);
    }
}
