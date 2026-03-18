package generics;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Double> doubles = Arrays.asList(1.0, 2.5, 3.8);
		System.out.println(sumList(ints));
		System.out.println(sumList(doubles));
	}

	static double sumList(List<? extends Number> list) {
		return list.stream().mapToDouble(Number::doubleValue).sum();
	}
}
