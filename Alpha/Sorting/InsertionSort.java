package Alpha.Sorting;

public class InsertionSort {

    public static void sortByInsertionSort(int arr[]) {

        int n = arr.length;

        // funda is to shift the prev to curr position if it is bigger than the current
        // one.

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding and shifting the position of the larger one to the right.

            while (prev >= 0 && arr[prev] > curr) {

                arr[prev + 1] = arr[prev]; // becuase we are shifting to the next position. This will make the the
                                           // previos
                // position empty and curr position filled withe previous value
                prev--; // to run the loop as many times it required to fill the correct position.

            }
            arr[prev + 1] = curr;// prev +1 is to avoid non negative index.
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 0, 7, 21, 1 };

        sortByInsertionSort(arr);

    }

}
