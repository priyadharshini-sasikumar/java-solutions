class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int profit = prices[i] - min;
                max_profit = Math.max(max_profit, profit);
            }
        }

        return max_profit;
    }
}
