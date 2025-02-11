class Solution {
    public int maxProduct(int[] nums) {
        int prod=0;
        int n=nums.length;
        int maxprod=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            prod=1;
            for(int j=i;j<n;j++){
                prod=prod*nums[j];
                maxprod=Math.max(prod,maxprod);
            }
            
        }
        return maxprod;
    }
}