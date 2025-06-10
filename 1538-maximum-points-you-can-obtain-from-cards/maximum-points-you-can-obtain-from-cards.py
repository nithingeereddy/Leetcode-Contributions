class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        lsum=0
        for i in range(k):
            lsum+=cardPoints[i]
        rsum=0
        m=lsum
        n=len(cardPoints)-1
        for i in range(k-1,-1,-1):
            lsum-=cardPoints[i]
            rsum+=cardPoints[n]
            n-=1
            m=max(m,lsum+rsum)
        
        return m