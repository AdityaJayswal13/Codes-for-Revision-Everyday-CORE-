//for finding next permutation
//since we observe that if we iterate from end we find that there is a values in descending order and at a point we find the end of descending
//value so at the point were we find the end of descending value we get pivot point
//after finding pivot find we iterate again from last until we find the number which is greater than pivot index value 
//then simply swap it with the greater value
//and last sort the value after pivot index so that we get the next permutation

class Solution {
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int pivot=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(arr);
        }
        else{
            for(int i=n-1;i>pivot;i--){
                if(arr[i]>arr[pivot]){
                    swap(arr,i,pivot);
                    break;
                }
            }
        }
        Arrays.sort(arr,pivot+1,n) ;       
    }
}
