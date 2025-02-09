// |
// |        end /|
// |           / |
// |   mid   /   |
// |       /     |    / end   
// |   L1 /      |  /mid   L2
// |    start    ./start
// |
// |__________________________________________


//so ,here first of all we find where mid lie on line 1 or line2
//if it's line 1 then we check for our target position if it is behind the mid then we simply made our end =mid-1 else start=mid+1;
//if it's line 2 then we check for our target position if it is ahead of mid and below the end then we simply make our start=mid+1;
//else end=mid-1








class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
