package Alpha.Sorting;

public class SelectionSort {

    public static void sortBySelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 0, 7, 21, 1 };
        sortBySelectionSort(arr);

    }
}
