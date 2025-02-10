class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int l=prices.length;
        for(int i=0;i<l;i++){
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
            else{
                profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}