class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int evenCount=palindromeCount(s,i,i+1);
            int oddCount=palindromeCount(s,i-1,i+1);
            ans+=evenCount+oddCount+1;
        }
        return ans;
    }
    public int palindromeCount(String s,int left,int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left--)==s.charAt(right++)){
            count++;
        }
        return count;
    }
}