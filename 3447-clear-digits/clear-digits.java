//First of all we take a stringbuilder sb and put our string into it   (StringBuilder sb=new StringBuilder(s)) like this
//Then we go character by character and check for digit by Character.isDigit(sb.charAt(charIdx)
//if it is a digit simply remove from string builder(sb.deleteCharAT(charIdx)
//and also if charIdx is greater than 0 then simply remove the left character
//and decrement it why? because when we delete any character we shifted to left side but the cursor is pointing to same index
//if we remove a digit then we move left by one character again we delete the character and move to left by one character
//now this time we should move our idx to left side so that the character have not skipped example ( e.g ab1c3)
//else if not a digit go for the another character



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
