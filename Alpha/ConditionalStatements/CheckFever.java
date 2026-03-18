package Alpha.ConditionalStatements;

import java.util.Scanner;

public class CheckFever {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature. ..");
        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("You have fever.. Take Rest.");
        } else {
            System.out.println("You are healthy. Enjoy the life.. ");
        }
        sc.close();
    }
}
