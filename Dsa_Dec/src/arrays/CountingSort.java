package arrays;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 1, 3, 2, 4, 2, 3, 5, 7, 8 };
		int[] countingSort = countingSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] countingSort(int arr[]) {

		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			largest = Math.max(largest, arr[i]);
		}

		int count[] = new int[largest + 1];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println(arr.length);
		System.out.println(count.length);
		int j = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}

		return arr;
	}

}
