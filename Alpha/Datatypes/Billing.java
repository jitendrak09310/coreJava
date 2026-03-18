package Alpha.Datatypes;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();

        float totalWithoutGst = item1 + item2 + item3;
        System.out.println("Total bill without GST " + totalWithoutGst);

        float totalWithGst = (item1 + item2 + item3) * 1.18f;
        System.out.println("Total bill without GST " + totalWithGst);
        sc.close();
    }
}
