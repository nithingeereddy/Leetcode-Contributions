class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        dic={}
        t=maxi=0
        for i,ch in enumerate(s):
            if ch in dic and dic[ch]>=t: 
                t=dic[ch]+1
            dic[ch]=i
            maxi=max(i-t+1,maxi)
        return maxi