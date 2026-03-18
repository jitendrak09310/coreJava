package oops;

public class ConstructorWithSuper {

	public static void main(String[] args) {

		new Child();

	}

}

class Child extends Parent {

	Child() {
		super("Hello");
		System.out.println("Child");
	}
}

class Parent {
	Parent() {
		System.out.println("Parent");
	}

	Parent(String s) {
		System.out.println("Parent : " + s);
	}
}
