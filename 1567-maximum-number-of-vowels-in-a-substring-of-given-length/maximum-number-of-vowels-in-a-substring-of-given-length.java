class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiou";
        int l=0,r=0,c=0,m=0;
        while(r<s.length()){
            if(vowels.indexOf(s.charAt(r))!=-1){
                c++;
            }
            if(r-l+1>k){
             if(vowels.indexOf(s.charAt(l))!=-1){
                c--;
             }
             l++;
            }
            m=Math.max(m,c);
            r++;
        }
        return m;
    }
}