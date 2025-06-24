class Solution {
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(nums);
        }
        else{
            for(int i=n-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    swap(nums,i,pivot);
                    break;
                }
            }
            Arrays.sort(nums,pivot+1,n);
        }
    }
}