package Alpha.Arrays;

public class SubArrayMaxSum {
    public static void subArrayMaxSum(int arr[]) {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.println(currSum);
            }

        }
        System.out.println("Max Sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 10 };
        subArrayMaxSum(arr);

    }
}
