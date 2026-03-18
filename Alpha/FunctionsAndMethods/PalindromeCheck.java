package Alpha.FunctionsAndMethods;

public class PalindromeCheck {

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(12121);
        System.out.println(isPalindrome);

    }

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int originalNUm = num;
        while (num > 0) {

            int lastDigit = num % 10;

            reverse = lastDigit + reverse * 10;

            num = num / 10;

        }
        if (reverse == originalNUm) {
            return true;
        } else {
            return false;
        }

    }
}
