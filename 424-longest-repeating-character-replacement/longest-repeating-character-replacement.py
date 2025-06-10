class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        l=0
        maxL=0
        maxF=0
        freq=[0]*26
        for i,ch in enumerate(s):
            freq[ord(ch)-ord('A')]+=1
            maxF=max(maxF,freq[ord(ch)-ord('A')])
            while (i-l+1)-maxF>k:
                freq[ord(s[l])-ord('A')]-=1
                l+=1
            maxL=max(maxL,i-l+1)
        return maxL
