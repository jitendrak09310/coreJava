package Alpha.Loops;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Integer Set.");
        int size = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter numbers : ");
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Sum of even number is : " + evenSum);
        System.out.println("Sum of odd number is : " + oddSum);
    }
}
