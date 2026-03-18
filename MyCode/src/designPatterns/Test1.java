package designPatterns;

public class Test1 {

	public static void main(String[] args) {
		Calculator add = new Calculator((a, b) -> a + b);
		Calculator mul = new Calculator((a, b) -> a * b);
		System.out.println(add.calc(3, 4));
		System.out.println(mul.calc(3, 4));
	}

}

class Calculator {
	private Strategy strategy;

	Calculator(Strategy s) {
		this.strategy = s;
	}

	int calc(int a, int b) {
		return strategy.execute(a, b);
	}
}

interface Strategy {
	int execute(int a, int b);
}
