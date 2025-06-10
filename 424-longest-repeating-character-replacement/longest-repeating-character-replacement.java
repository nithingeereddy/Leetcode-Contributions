class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxF=0,maxL=0;
        int a[]=new int[26];
        while(r<s.length()){
            a[s.charAt(r)-'A']++;
            maxF=Math.max(maxF,a[s.charAt(r)-'A']);
            while((r-l+1)-maxF>k){
                a[s.charAt(l)-'A']--;
                l++;
            }
            maxL=Math.max(maxL,r-l+1);
            r++;
        }
        return maxL;
    }
}