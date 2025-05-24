class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,c=0,maxLen=0,maxFreq=0;
        int a[]=new int[26];
        while(r<s.length()){
            a[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,a[s.charAt(r)-'A']);
            while((r-l+1)-maxFreq>k){
                a[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(r-l+1,maxLen);
            r++;
            }
    return maxLen;
    }
}