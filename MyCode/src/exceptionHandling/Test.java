package exceptionHandling;

public class Test {

	public static void main(String[] args) {

		try {
			int result = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("caught ;" + e.getMessage());
		} finally {
			System.out.println("Finally..");
		}

	}

}
