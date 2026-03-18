package Alpha.Strings;

public class ShortestPath {

    public static float getShortestPath(String str) {

        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(y2 + x2);
    }

    public static void main(String[] args) {

        String str = "NSSS";

        float shortestPath = getShortestPath(str);
        System.out.println(shortestPath);

    }
}
