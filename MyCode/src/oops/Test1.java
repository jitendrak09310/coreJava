package oops;

public class Test1 {
	public static void main(String[] args) {

		P obj = new R();
		obj.method();
	}
}

class P {
	void method() {
		System.out.println("P");
	}
}

class Q extends P {
	void method() {
		System.out.println("Q");
	}
}

class R extends Q {
	void method() {
		super.method();
		System.out.println("R");
	}

}