class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        dic={}
        maxi=l=r=0
        while r<len(s):
            if s[r] in dic and dic[s[r]]>=l:
                l=dic[s[r]]+1
            dic[s[r]]=r
            maxi=max(maxi,r-l+1)
            r+=1
        return maxi
        