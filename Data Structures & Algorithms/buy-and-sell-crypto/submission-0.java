class Solution {
    public int maxProfit(int[] prices) {
        int[] arr = new int[prices.length * 20];
        int sum = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                arr[sum++] = prices[j] - prices[i];
            }
      }
      int max = 0;
      for(int k =1; k < arr.length; k++){
        if(arr[k] > max){
            max = arr[k];
        }
      }
      return max;
    }
}
