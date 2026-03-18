package generics;

public class Box<T> {

	private T value;

	Box(T v) {
		this.value = v;
	}

	T get() {
		return value;
	}

	public String toString() {
		return "Box[" + value + "]";
	}

}
