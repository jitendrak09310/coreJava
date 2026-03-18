package comparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Bob", 25));
		list.add(new Student("Alice", 22));
		list.add(new Student("Charlie", 30));
		Collections.sort(list);
		System.out.println(list);

		List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Dave");
		names.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		System.out.println(names);

	}

}
