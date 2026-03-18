package enums;

public class Test {
	public static void main(String[] args) {
		Day d = Day.SAT;

		System.out.println(d.name());
		System.out.println(d.ordinal());
		System.out.println(d.isWeekend());
		System.out.println(Day.values().length);

	}
}

enum Day {
	MON, TUE, THURS, WED, FRI, SAT, SUN;

	boolean isWeekend() {
		return this == SAT || this == SUN;
	}
}
