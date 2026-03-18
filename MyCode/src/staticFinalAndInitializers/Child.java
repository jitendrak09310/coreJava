package staticFinalAndInitializers;

public class Child extends Parent {
	static {// Order : parent static -->child static -> parent instance block -> parent
			// constructor -> child instance block -> child constructor.
		System.out.println("Child Static..");
	}
	{
		System.out.println("Child IIB ..");
	}

	Child() {
		System.out.println("Child Constructor .. ");
	}

	public static void main(String[] args) {

		new Child();

	}

}
