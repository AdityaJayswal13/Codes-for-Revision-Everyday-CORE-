class Solution {
    public boolean isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s.substring(i,j+1))){
                    count++;
                }
            }
        }
        return count;
    }
}