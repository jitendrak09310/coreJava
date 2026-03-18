package Alpha.Arrays;

public class MaximimProfit {

    public static int findMaxProfit(int[] prices) {

        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (bp < prices[i]) {
                int profit = prices[i] - bp;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                bp = prices[i];
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {

        int prices[] = { 7, 6, 4, 3, 1 };
        int maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);

    }
}
