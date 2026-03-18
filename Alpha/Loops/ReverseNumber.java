package Alpha.Loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastDigit;
        }
        System.out.println(rev);
    }
}
