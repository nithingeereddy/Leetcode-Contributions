class Solution {
    public boolean isValid(String word) {
        boolean isV=false,isC=false,isD=false;
        String s="aeiou";
        word=word.toLowerCase();
        if(word.length()<3) return false;
        char[] c=word.toCharArray();
        for(char c1:c){
            if(Character.isDigit(c1)) {
                isD=true;
                
            }
            else if(Character.isLetter(c1)){
                if(s.indexOf(c1)!=-1) isV=true;
                else isC=true;
             } else {
            return false;
             }
        }
        return isV && isC;
    }
}