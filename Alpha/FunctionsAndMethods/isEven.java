package Alpha.FunctionsAndMethods;

public class isEven {

    public static void main(String[] args) {
        boolean isEven = isEven(10);
        System.out.println(isEven);

    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
