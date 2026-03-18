package Alpha.Arrays;

public class FindNumFromArray {

    public static int findNum(int n, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int n = 100;
        int[] arr = { 12, 34, 35, 456, 567, 53, 23, 10, 2, 4, 46, 5, 51 };
        int index = findNum(n, arr);
        System.out.println("Number is present at  :" + index);

    }
}
