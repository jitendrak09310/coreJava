package Alpha.Sorting;

public class DescendingOrderByAllTypes {

    public static void descendingOrderByBubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void descendingOrderBySelectionSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] < arr[j]) {
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

    public static void descendingOrderByInsertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void descendingOrderByCountingSort(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        // range
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1]; // +1 because we are also considering the o as positive number.
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
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

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // descendingOrderByBubbleSort(arr);
        // descendingOrderBySelectionSort(arr);
        // descendingOrderByInsertionSort(arr);
        descendingOrderByCountingSort(arr);
    }
}
