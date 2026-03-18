package arraysOperations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysOperations {

	public static void main(String[] args) {

		int[] arr = new int[5];

		System.out.println(arr[0]);
		System.out.println(arr.length);

		int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		System.out.println(matrix.length);
		System.out.println(matrix[1][1]);
		System.out.println(matrix[2][0]);

		int a[] = { 3, 1, 3, 1, 5, 9 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println(Arrays.binarySearch(a, 5));

		int original[] = { 1, 2, 3, 4, 5 };
		int copy[] = Arrays.copyOfRange(original, 1, 4);// doesn't include the last index.
		System.out.println(Arrays.toString(copy));
		int[] copy2 = Arrays.copyOf(copy, 7);

		System.out.println(Arrays.toString(copy2));

		int ar[] = { 1, 2, 3 };
		int b[] = ar; // it copies the reference both point to same array. Hence change will happen.

		b[0] = 99;

		System.out.println(Arrays.toString(ar));
		System.out.println(ar == b);

		int[] c = Arrays.copyOf(ar, ar.length);// it creates a separate copy. Hence it will not impact ar or b..
		c[0] = 0;
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(c));

		int[] arb = { 10, 20, 30 };

		System.out.println(arb instanceof Object);
 
		System.out.println(arb instanceof int[]);

		System.out.println(arb.getClass().getSimpleName());

	}
}
