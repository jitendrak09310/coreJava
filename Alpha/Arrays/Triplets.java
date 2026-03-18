package Alpha.Arrays;

import java.util.*;

public class Triplets {
    public static List<List<Integer>> getTriplets(int nums[]) {

        int n = nums.length;

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplets = new ArrayList<Integer>();
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        Collections.sort(triplets);
                        result.add(triplets);

                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));

        return result;
    }

    public static void main(String[] args) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> list = getTriplets(nums);

        for (List<Integer> list2 : list) {

            System.out.println(list2);

        }

    }
}
