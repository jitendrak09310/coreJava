package optional;

import java.util.Optional;

public class Test1 {

	static Optional<String> find(boolean found) {
		return found ? Optional.of("Alice") : Optional.empty();
	}

	public static void main(String[] args) {
		String r1 = find(false).orElseGet(() -> "unknown");
		find(true).ifPresent(n -> System.out.println("Found : " + n));
		Optional<String> upper = find(true).map(String::toUpperCase);
		System.out.println(upper.orElse("none"));

	}
}
