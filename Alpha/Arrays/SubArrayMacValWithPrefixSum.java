package Alpha.Arrays;

public class SubArrayMacValWithPrefixSum {

    public static void getSubarrayMaxSum(int arr[]) {

        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[n];

        prefix[0] = arr[0];

        // to Find the prefix and save the values at the same index of the arr.
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // To find the start and end. Because we can only implement formula after this.
        // Formula is : currSum = prefix[end] + prefix[start-1]
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 10 };
        getSubarrayMaxSum(arr);

    }
}
