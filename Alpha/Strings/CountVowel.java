package Alpha.Strings;

import java.util.Scanner;

public class CountVowel {

    public static int countVowel(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (Character.isLowerCase(ch) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        int count = countVowel(str);
        System.out.println(count);

        String str1 = "Jitendra".replace("t", "");

        System.out.println(str1);

    }
}
