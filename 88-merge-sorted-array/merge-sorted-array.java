//here the logic is simply backtracking
//we simply take the last element of the two arrays and comparing with themseleve whosever small just put it to the last of nums1 because it has extra space
//now one very important logic what happen when the one array is empty then i=-1 as per the code 
//so remember we give i>=0 condition inside the while loop so that if array is empty the iteration go to the else part



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
       int j=n-1;
       int k=m+n-1;

       while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
               
            }
            else{
                nums1[k--]=nums2[j--];
               
            }
       }
    }
}
