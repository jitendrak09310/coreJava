package wrapperAndAutoboxing;

public class Test {

	public static void main(String[] args) {
		Integer a = 127, b = 127, c = 128, d = 128;
		System.out.println(a == b);
		System.out.println(c == d);// This value is not cached. new obejct will be created. hence false
		System.out.println(c.equals(d));
	}

}
