package oops;

public class Constructors {
	int x = 10;

	public Constructors() {
		System.out.println(x);
		System.out.println("This is JK");
	}

	public Constructors(String name, int age) {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		Constructors constructors = new Constructors();
		Constructors constructors2 = new Constructors("Jitu", 32);

	}
}
