package Alpha.Arrays;

public class getLargestSmallestNum {

    public static void printHighest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Minimum number is : " + min);
        System.out.println("Largest number is : " + max);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 35, 456, 567, 53, 23, 10, 2, 4, 46, 5, 51 };

        printHighest(arr);
    }
}
