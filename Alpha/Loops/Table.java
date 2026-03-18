package Alpha.Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("See the table below : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
