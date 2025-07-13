class Solution {
    public String mergeAlternately(String word1, String word2) {
        int f=0,l=0,r=0;
        String s="";
        while(l<word1.length() || r<word2.length()){
            if(l<word1.length()){
                s+=word1.charAt(l++);
            }
            if(r<word2.length()){
                s+=word2.charAt(r++);
            }
        }
        return s;
    }
}