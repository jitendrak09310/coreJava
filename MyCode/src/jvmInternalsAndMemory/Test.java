package jvmInternalsAndMemory;

public class Test {

	public static void main(String[] args) {

		String a = "hello";
		String b = "hel" + "lo";
		String c = "hel";
		String d = c + "lo";// c will be resolved at runtime hence a== d will be false.

		System.out.println(a == b);
		System.out.println(a == d);
		System.out.println(a.equals(d));
	}

}
