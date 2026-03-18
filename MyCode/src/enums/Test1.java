package enums;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(Operation.ADD.apply(3, 4));
		System.out.println(Operation.MUL.apply(6, 3));
		System.out.println(Operation.SUB.apply(10, 5));
	}

}

enum Operation {
	ADD {
		int apply(int a, int b) {
			return a + b;
		}
	},
	SUB {
		int apply(int a, int b) {
			return a - b;
		}

	},
	MUL {
		int apply(int a, int b) {
			return a * b;
		}
	};

	abstract int apply(int a, int b);

}
