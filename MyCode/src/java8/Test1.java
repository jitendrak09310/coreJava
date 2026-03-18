package java8;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

		names.stream().filter(s -> s.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);

	}

}
