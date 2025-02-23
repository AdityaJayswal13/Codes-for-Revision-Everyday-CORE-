class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int right=height.length-1;
        int maxArea=Integer.MIN_VALUE;
         while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
         }
         return maxArea;
    }
}