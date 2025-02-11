class Solution {
    public int[] productExceptSelf(int[] nums) {
       int ans[]=new int[nums.length];
       Arrays.fill(ans,1);
       int sufix=1;
       for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
       } 
       for(int i=nums.length-2;i>=0;i--){
            sufix*=nums[i+1];
            ans[i]=ans[i]*sufix;
       }
       return ans;
        
    }
}