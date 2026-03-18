package Alpha.Loops;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("Prime Number..");
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }

        }
        if (!isPrime) {
            System.out.println("Not a Prime");
        } else {
            System.out.println("Prime");
        }

    }
}
