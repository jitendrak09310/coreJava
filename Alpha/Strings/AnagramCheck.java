package Alpha.Strings;

import java.util.Arrays;

public class AnagramCheck {

    public static boolean checkAnagram(String str, String str1) {
        boolean isAnagram = false;
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if (str.length() == str1.length()) {

            char[] strCharArr = str.toCharArray();
            char[] str1CharArr = str1.toCharArray();

            Arrays.sort(strCharArr);
            Arrays.sort(str1CharArr);
            if (Arrays.equals(strCharArr, str1CharArr)) {
                isAnagram = true;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        String str = "vanik";
        String str1 = "kanvi";

        Boolean isAnagram = checkAnagram(str, str1);
        System.out.println(isAnagram);
    }
}
