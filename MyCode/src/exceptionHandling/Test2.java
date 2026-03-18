package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		try {
			String s = null;
			s.length();
		} catch (NullPointerException e) {
			System.out.println("NPE Caught");
		} catch (Exception e) {
			System.out.println("Exception Caught..");
		}
	}

}
