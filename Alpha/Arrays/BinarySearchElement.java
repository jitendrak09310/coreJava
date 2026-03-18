package Alpha.Arrays;

public class BinarySearchElement {
    public static int findElement(int n, int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (n == arr[mid]) {
                return mid;
            }
            if (n > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = { 1, 2, 3, 4, 10, 12, 30, 34, 56, 78, 90, 100 };

        int index = findElement(n, arr);
        System.out.println(index);
    }
}
