package interfaceAbstraction;

public class InterfaceImplementation implements Greet {
	public static void main(String[] args) {
		
		new InterfaceImplementation().hello();

	}

}

interface Greet {
	default void hello() {
		System.out.println("Hello from Interface..");
	}
}
