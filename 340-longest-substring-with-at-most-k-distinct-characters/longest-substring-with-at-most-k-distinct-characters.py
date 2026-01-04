class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        l=r=maxi=0
        dic={}
        if k==0: 
            return 0
        while r<len(s):
            dic[s[r]]=dic.get(s[r],0)+1
            while(len(dic)>k):
                dic[s[l]]=dic.get(s[l])-1
                if(dic[s[l]]==0):
                    del dic[s[l]]
                l+=1
            maxi=max(maxi,r-l+1)
            r+=1
        return maxi