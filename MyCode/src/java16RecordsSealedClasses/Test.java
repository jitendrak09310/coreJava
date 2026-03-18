package java16RecordsSealedClasses;

public class Test {

	public static void main(String[] args) {
		String text = """
				Hello,World!
				""";

		System.out.println(text.strip());
		System.out.println(text.lines().count());
	}

}
