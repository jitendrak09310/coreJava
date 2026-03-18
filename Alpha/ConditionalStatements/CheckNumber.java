package Alpha.ConditionalStatements;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        sc.close();
    }
}
