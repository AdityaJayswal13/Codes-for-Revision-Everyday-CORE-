//first sort lexigraphically so that the smallest string and the largest string are in the first and last respecively in array
//take the first array of characters of first string 
//take the second array of character of last string 
//and take a for loop and check for first string charcters with the last if at any point the characters will not matched simply return the srtring
//do it with help of stringBuilder 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] second=strs[strs.length-1].toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<first.length;i++){
            if(first[i]!=second[i]){
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
        
    }
}
