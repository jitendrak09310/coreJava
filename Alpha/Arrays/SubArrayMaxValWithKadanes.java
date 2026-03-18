package Alpha.Arrays;

public class SubArrayMaxValWithKadanes {

    public static void maxValWithKadanes(int arr[]) {
        int n = arr.length;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean negArray = true;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                negArray = false;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] > largest) {
                largest = arr[j];
            }

        }

        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];
            if (!negArray) {
                if (currSum < 0) {
                    currSum = 0;
                }
                maxSum = Math.max(maxSum, currSum);
            } else {
                maxSum = largest;
            }

        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, -5, -3 };

        maxValWithKadanes(arr);
    }
}
