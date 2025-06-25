class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
            else{
                int profit=prices[i]-buyprice;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}