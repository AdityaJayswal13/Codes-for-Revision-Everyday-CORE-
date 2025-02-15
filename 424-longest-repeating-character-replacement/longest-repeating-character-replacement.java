class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> freq=new HashMap();
        int left=0,res=0,maxFreq=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,freq.get(c));

            while((i-left+1)-maxFreq>k){
                char leftchar=s.charAt(left);
                freq.put(leftchar,freq.get(leftchar)-1);
                left++;
            }
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}