package oops;

public class RuntimePolymorphismWithStaticMethods {

	public static void main(String[] args) {
		Base b = new Derived();

		System.out.println(b.greet());
		System.out.println(b.name());

	}

}

class Base {

	static String greet() { // because method is static. it will use reference type. -- not overriding.
		// Static h to jiske reference se call kr rahe h usse hi call karega..
		return "Hello from base";
	}

	String name() {
		return "Base";
	}

}

class Derived extends Base {
	static String greet() {
		return "Hello from Derived";
	}

	String name() {
		return "Derived";
	}
}