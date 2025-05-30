//So first first of all we find the leftMax BOundry for each height
//simlarly right Max boundry for each height
//And then waterlevel the min of leftmax and rightMax
//simply find the trapped rain water by subtracting the waterlevel to every respective heights

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];
        int trapRainwater=0;
        int waterLevel=0;
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            waterLevel=Math.min(leftMax[i],rightMax[i]);
            trapRainwater+=waterLevel-height[i];
        }
        return Math.abs(trapRainwater);
        
    }
}
