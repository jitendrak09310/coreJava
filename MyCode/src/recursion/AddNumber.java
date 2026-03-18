package recursion;

public class AddNumber {

	public static int sum(int n) {
		if (n > 0) {
			return n + sum(n - 1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		int n = 10;
		int sum = sum(n);
		System.out.println(sum);
	}

}
