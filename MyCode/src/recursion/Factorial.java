package recursion;

public class Factorial {

	public static int printFactorial(int n) {
// n*(n-1)

		if (n == 1) {
			return 1;
		}
		return n * (printFactorial(n - 1));
	}

	public static void main(String[] args) {
		int n = 5;

		int printFactorial = printFactorial(n);
		System.out.println(printFactorial);
	}
}
