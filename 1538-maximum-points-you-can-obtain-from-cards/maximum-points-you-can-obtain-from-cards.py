class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        lsum,rsum=0,0
        for i in range(k):
            lsum+=cardPoints[i]
        
        maxSum=lsum
        rightIn=len(cardPoints)-1
        for j in range(k-1,-1,-1):
            lsum=lsum-cardPoints[j]
            rsum+=cardPoints[rightIn]
            rightIn-=1
            maxSum=max(maxSum,lsum+rsum)
        return maxSum
        