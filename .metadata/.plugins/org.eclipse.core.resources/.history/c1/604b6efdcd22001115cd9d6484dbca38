package java16RecordsSealedClasses;

public class Test1 {

	record Point(int x, int y) {
		double distance() {
			return Math.sqrt(x * x + y * y);
		}
	}

	public static void main(String[] args) {

		Point p = new Point(3, 4);
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.printf("%.1f%n", p.distance());
		System.out.println(p);
		System.out.println(new Point(3, 4).equals(p));

	}

}
