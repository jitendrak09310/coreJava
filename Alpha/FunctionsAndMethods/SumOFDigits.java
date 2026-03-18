package Alpha.FunctionsAndMethods;

public class SumOFDigits {

    public static void main(String[] args) {
        int sumOfDigits = sumOfDigits(322);
        System.out.println(sumOfDigits);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            sum = sum + lastDigit;

            n = n / 10;

        }

        return sum;
    }
}
