package designPatterns;

public class Test {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.inc();
		s1.inc();
		s2.inc();

		System.out.println(s1.get());
		System.out.println(s1 == s2);
	}

}

class Singleton {
	private static Singleton instance;
	private int count = 0;

	private Singleton() {
	}

	static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	void inc() {
		count++;
	}

	int get() {
		return count;
	}
}
