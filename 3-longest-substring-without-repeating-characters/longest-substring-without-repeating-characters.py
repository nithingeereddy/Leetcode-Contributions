class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l,r,maxLen=0,0,0
        lastSeen={}
        while(r<len(s)):
            if s[r] in lastSeen and lastSeen[s[r]]>=l:
                l=lastSeen[s[r]]+1
            lastSeen[s[r]]=r
            maxLen=max(maxLen,r-l+1)
            r+=1
        return maxLen










        # l,r,maxLen=0,0,0
        # charSet=set()
        # while(r<len(s)):
        #     while s[r] in charSet:
        #         charSet.remove(s[l])
        #         l+=1
        #     charSet.add(s[r])
        #     maxLen=max(maxLen,r-l+1)
        #     r+=1
        # return maxLen