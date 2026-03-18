package recursion;

public class Test3 {

	public static void main(String[] args) {
		System.out.println(power(2, 10));
		System.out.println(power(3, 4));
	}

	static int power(int base, int exp) {
		if (exp == 0) {
			return 1;
		}
		if (exp % 2 == 0) {
			int half = power(base, exp / 2);
			return half * half;

		}
		return base * power(base, exp - 1);
	}
}
