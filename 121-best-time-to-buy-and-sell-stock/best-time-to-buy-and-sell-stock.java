class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Track the minimum price so far
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate today's profit if sold today
            int profit = price - minPrice;

            // Update max profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
