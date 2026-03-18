package Alpha.Sorting;

public class CountingSort {

    public static void sortByCountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;

        // get largest for the range.
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // frequency in new count array.
        int[] count = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // for sorting old array..
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        sortByCountingSort(arr);
    }
}
