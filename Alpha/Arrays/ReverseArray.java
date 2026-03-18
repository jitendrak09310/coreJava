package Alpha.Arrays;

public class ReverseArray {
    public static int[] reverse(int arr[]) {

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 10, 12, 30, 34, 56, 78, 90, 100 };
        int[] reversedArr = reverse(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(reversedArr[i] + " ");
        }

    }
}
