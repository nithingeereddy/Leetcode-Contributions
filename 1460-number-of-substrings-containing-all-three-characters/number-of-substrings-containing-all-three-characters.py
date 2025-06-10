class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        lastSeen=[-1,-1,-1]
        count=0
        for i,ch in enumerate(s):
            lastSeen[ord(ch)-ord('a')]=i
            if -1 not in lastSeen:
                count+=min(lastSeen)+1
        return count
