class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char[] c=s.toCharArray();
        String vowels="aeiouAEIOU";
        String s1="";
        while(l<r){
            while(l<r && vowels.indexOf(c[l])==-1){
                l++;
            }
            while(l<r && vowels.indexOf(c[r])==-1){
                r--;  
            }
           
            char t=c[l];
            c[l]=c[r];
            c[r]=t;
            l++;
            r--;
        }
        // for(char c1:c){
        //     s1+=c1;
        // }
        return new String(c);
    }
}