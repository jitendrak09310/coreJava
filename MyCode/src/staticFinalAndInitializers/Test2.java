package staticFinalAndInitializers;

public class Test2 {

	final int x;
	{
		x = 42;
	}

	Test2() {
		System.out.println("x = " + x); // iib will run before constructor. Hence 42 will be assigned tox

	}

	public static void main(String[] args) {

		new Test2();

	}

}
