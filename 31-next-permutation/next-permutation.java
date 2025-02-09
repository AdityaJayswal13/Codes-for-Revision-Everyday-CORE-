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