package Alpha.Arrays;

public class TrappedRainWater {
    public static int calculateTrappedRainWater(int height[]) {

        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        // calculate left max array.
        int TrappedRainWater = 0;

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate the right max value.
        int rightMax[] = new int[n];

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            // calculate the water level
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            // calculate the trapped water and adding total
            TrappedRainWater += waterLevel - height[i];
        }

        return TrappedRainWater;
    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int TrappedRainWater = calculateTrappedRainWater(height);
        System.out.println(TrappedRainWater);

    }
}
