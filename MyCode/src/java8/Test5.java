package java8;

import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		OptionalInt max = IntStream.of(3, 1, 4, 1, 5, 9, 2, 6).max();
		System.out.println(max.getAsInt());
		
		
		String joined = Stream.of("a","b","c")
		.collect(Collectors.joining(",","[","]"));
		System.out.println(joined);
		
		
	}

}
