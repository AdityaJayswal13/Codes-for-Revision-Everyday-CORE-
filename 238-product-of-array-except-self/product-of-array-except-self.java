//Brute force approach: first we iterate a loop over the array and another nested loop with condition that i!=j we simply multiply for each i 
//and store in an ans array
//mid optimal approach : take two array prefix and sufix just find the prefix by multipy with prefix[i-1] and nums[i-1] it gives the 
//prefix multiplication of all the previous element except self
//similarly find the suffix array by multiplying the right side sufix value with right side num to get all the multiplication from right
//except selt 
//In the last multiply sufix and prefix so that we find the right product in the right place with except self multiplied in the ans element
//OPTIMAL Approach: why we use prefix and sufix?????
//we simply made our ans array to prefix 
//and take a sufix variable to store the sufix and just multiply it with ans

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
