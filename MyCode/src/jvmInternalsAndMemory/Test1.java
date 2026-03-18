package jvmInternalsAndMemory;

public class Test1 {
	static void change(int x) {
		x = 99;
	}

	static void change(int arr[]) {
		arr[0] = 99;
	}

	static void replace(int[] arr) {
		arr = new int[] { 0 };
	}

	public static void main(String[] args) {

		int a = 1; // primitive are pass by value. hence unchanged. ..
		change(a);
		System.out.println(a);
		int[] arr = { 1, 2, 3 };
		change(arr);// array pass reference by Value. ..
		System.out.println(arr[0]);
		replace(arr);// replace reassigns the value. ..

		System.out.println(arr[0]);

	}

}
