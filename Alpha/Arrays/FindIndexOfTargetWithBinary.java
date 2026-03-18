package Alpha.Arrays;

public class FindIndexOfTargetWithBinary {

    public static int findIndexOfTarget(int nums[], int target) {
        int index = -1;
        int n = nums.length;

        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] < nums[mid]) {// left part is sorted.
                if (target < nums[mid] && target > nums[start]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {// right part is sorted.
                if (target > nums[mid] && target > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 4, 5, 6, 7 };
        int index = findIndexOfTarget(nums, 49);
        System.out.println(index);

    }
}
