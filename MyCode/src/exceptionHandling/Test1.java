package exceptionHandling;

public class Test1 {

	public static void main(String[] args) {

		System.out.println(method());

	}

	static int method() {
		try {
			return 1;
		}

		finally {
			return 2;
		}
	}
}
