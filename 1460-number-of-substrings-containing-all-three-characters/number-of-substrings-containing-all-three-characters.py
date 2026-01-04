class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        l=[-1,-1,-1]
        cnt=0
        for i,ch in enumerate(s):
            l[ord(ch)-ord('a')]=i
            if(l[0]!=-1 and l[1]!=-1 and l[2]!=-1):
                cnt+=min(l)+1

        return cnt