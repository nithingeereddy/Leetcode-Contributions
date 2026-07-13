class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l,r,maxLen=0,0,0
        charSet=set()
        while(r<len(s)):
            while s[r] in charSet:
                charSet.remove(s[l])
                l+=1
            charSet.add(s[r])
            maxLen=max(maxLen,r-l+1)
            r+=1
        return maxLen