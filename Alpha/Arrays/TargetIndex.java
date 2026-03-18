package Alpha.Arrays;

public class TargetIndex {

    public static int findIndexOfTarget(int nums[], int target) {

        int index = -1;

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                index = i;
            }
        }

        return index;

    }

    // public static int findIndexOfTargetB(int nums[], int target) {

    // int index = -1;
    // int n = nums.length;
    // int start = 0;
    // int end = n - 1;

    // int mid = (start + end) / 2;

    // while (start <= end) {

    // if (nums[mid] == target) {
    // return mid;
    // }
    // if (nums[mid] > target) {
    // end = mid - 1;

    // } else {
    // start = mid + 1;
    // }

    // }
    // return index;

    // }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 4, 5, 6, 7 };
        int index = findIndexOfTarget(nums, 4);
        // int indexB = findIndexOfTargetB(nums, 3);
        System.out.println(index);
        // System.out.println(indexB);
    }
}
