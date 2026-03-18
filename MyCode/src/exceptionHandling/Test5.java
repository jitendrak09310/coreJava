package exceptionHandling;

public class Test5 {
	static void validate(int age) {
		if (age < 0) {
			throw new CustomException("Invalid Age", 400);
		}
	}

	public static void main(String[] args) {
		try {
			validate(-1);

		} catch (CustomException e) {
			System.out.println("Caught : " + e.getMessage() + " Code= " + e.code);
		}
	}
}

class CustomException extends RuntimeException {
	int code;

	public CustomException(String msg, int code) {
		super(msg);
		this.code = code;
	}

}
