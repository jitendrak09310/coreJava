package interfaceAbstraction;

public class C implements A, B {
	public static void main(String[] args) {
		new C().print();
	}

	void print() {
		System.out.println(A.x + " " + B.x);// interface can be accessed by their name ...
	}
}

interface A {
	int x = 10;
}

interface B {
	int x = 20;
}
