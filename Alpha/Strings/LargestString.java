package Alpha.Strings;

public class LargestString {

    public static String getLargestString(String fruits[]) {

        String largest = fruits[0];
        for (String fruit : fruits) {
            if (fruit.compareTo(largest) < 0) {
                largest = fruit;
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        String fruits[] = { "apple", "banana", "mango", "lichi" };

        String largest = getLargestString(fruits);
        System.out.println(largest);

    }
}
