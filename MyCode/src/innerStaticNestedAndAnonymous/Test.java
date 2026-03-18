package innerStaticNestedAndAnonymous;

import innerStaticNestedAndAnonymous.Test.Printer;

public class Test {

	interface Printer {
		void print();
	}

	static Printer create(String msg) {
		return new Printer() {
			public void print() {
				System.out.println(msg.toUpperCase());
			}
		};
	}

	public static void main(String[] args) {
		Printer p = create("Hello");
		p.print();
	}
}
