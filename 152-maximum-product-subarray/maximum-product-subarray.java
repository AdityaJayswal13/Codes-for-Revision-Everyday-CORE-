class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int maxsum=arr[0];
        int leftProduct=1,rightProduct=1;
        for(int i=0;i<n;i++){
           leftProduct = (leftProduct == 0 || leftProduct < Integer.MIN_VALUE) ? 1 : leftProduct;
      rightProduct = (rightProduct == 0 || rightProduct < Integer.MIN_VALUE) ? 1 : rightProduct;
            leftProduct*=arr[i];
            rightProduct*=arr[n-i-1];
            maxsum=Math.max(maxsum,Math.max(rightProduct,leftProduct));
        }
        return maxsum;
    }
}