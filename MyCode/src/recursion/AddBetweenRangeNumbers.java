package recursion;

public class AddBetweenRangeNumbers {

	public static int sumBetweenRange(int start, int end) {

//		if (end > start) {
//			return end + sumBetweenRange(start, end - 1);
//		} else {
//			return end;
//		}
		if (start == end) {
			return end;
		}
		System.out.println(end);
		return end + sumBetweenRange(start, end - 1);
	}

	public static void main(String[] args) {
		int start = 4;
		int end = 10;
		int sumBetweenRange = sumBetweenRange(start, end);
		System.out.println(sumBetweenRange);
	}

}
