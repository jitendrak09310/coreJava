package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		List<List<Integer>> nested = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
		List<Integer> flattenedList = nested.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(flattenedList);

	}
}
