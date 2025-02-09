//just find the length of hashset and the nums array if they are not equal simply says duplicate exists



class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return set.size()!=nums.length;
    }
}
