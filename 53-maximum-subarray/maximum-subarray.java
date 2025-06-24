class Solution {
    public int maxSubArray(int[] nums) {
        int cursum=0;
        int res=Integer.MIN_VALUE;
        int max_so_far=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            max_so_far=Math.max(cursum,max_so_far);
            if(cursum<0){
                cursum=0;
            }
            res=Math.max(cursum,res);

        }
        if(res==0)
        return max_so_far;
        return res;
    }
}