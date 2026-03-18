package recursion;

public class CountDown {

	public static void countDown(int n) {

		if (n == 0) {
			return;
		}
		System.out.println(n + " ");
		countDown(n - 1);

	}

	public static void main(String[] args) {
		int n = 10;

		countDown(n);
	}

}
