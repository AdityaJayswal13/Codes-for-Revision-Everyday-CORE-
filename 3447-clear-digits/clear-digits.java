class Solution {
    public String clearDigits(String s) {
        int charIdx=0;
        StringBuilder sb=new StringBuilder(s);
        while(charIdx<sb.length()){
            if(Character.isDigit(sb.charAt(charIdx))){
                sb.deleteCharAt(charIdx);
                if(charIdx>0){
                    sb.deleteCharAt(charIdx-1);
                    charIdx--;
                }
                
            }
            else{
                charIdx++;
            }
        }
        return sb.toString();
    }
}