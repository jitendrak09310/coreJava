package Alpha.FunctionsAndMethods;

public class SumOfThreeNums {

    public static void main(String[] args) {
        int avg = avg(2, 3, 4);
        System.out.println(avg);

    }

    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
