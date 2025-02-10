//just take three variable profit ,buyPrice intialize with Integer.maxvalue ,maxprofit
//Remember if prices value is smaller than buyprice simply buyprice=prices[i]
//if the prices are greater than buyprice simply find the profit 
//and find the maxProfit
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
