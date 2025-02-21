class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track lowest price
        int maxProfit = 0;                 // Track max profit

        for (int price : prices) {
            if (price < minPrice) {  
                minPrice = price;  // Update min price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);  // Calculate profit
            }
        }
        return maxProfit;
    }
}
