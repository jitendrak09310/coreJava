package Alpha.ConditionalStatements;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year. ");
        int year = sc.nextInt();

        String isLeapYear = (year % 4 == 0) ? "Yes, It is leap Year" : "It is not a Leap Year";

        System.out.println(isLeapYear);
    }
}
