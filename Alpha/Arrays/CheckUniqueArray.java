package Alpha.Arrays;

import java.util.HashSet;

public class CheckUniqueArray {

    public static boolean checkUnique(int arr[]) {
        boolean isUnique = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return false;
                }
            }
        }
        return isUnique;

    }

    // using Sets

    public static boolean checkUsingSet(int arr[]) {
        boolean isUnique = true;

        HashSet set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                return false;
            }
        }

        return isUnique;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 24, 34, 3, 22, 4, 43 };

        // System.out.println(checkUnique(arr));
        System.out.println(checkUsingSet(arr));

    }

}
