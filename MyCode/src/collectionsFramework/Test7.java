package collectionsFramework;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
	public static void main(String[] args) {

		Map<String, Long> freq = Stream.of("a", "b", "b", "d", "d", "a")
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		System.out.println(new TreeMap<>(freq));
	}
}
