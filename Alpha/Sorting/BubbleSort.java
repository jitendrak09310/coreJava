package Alpha.Sorting;

public class BubbleSort {

    public static void sortByBubbleSort(int arr[]) {
        int n = arr.length;
        int swap = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Total swaps are :" + swap);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 0, 7, 21, 1 };
        sortByBubbleSort(arr);

    }
}
