class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        dic={}
        l=r=maxl=maxf=0
        while r<len(s):
            dic[s[r]]=dic.get(s[r],0)+1
            maxf=max(maxf,dic[s[r]])
            changes=(r-l+1)-maxf
            while changes>k:
                dic[s[l]] -= 1
                if dic[s[l]] == 0:
                    del dic[s[l]]
                l += 1
                maxf=max(maxf,dic[s[r]])
                changes=(r-l+1)-maxf
            maxl=max(maxl,r-l+1)
            r+=1

        return maxl

                
