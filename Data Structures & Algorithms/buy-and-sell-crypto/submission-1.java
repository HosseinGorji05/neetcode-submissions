class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit;
        int maxProf = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = prices[i] - min;
            if(profit > maxProf){
                maxProf = profit;
            }
        }
        return maxProf;
    }
}
