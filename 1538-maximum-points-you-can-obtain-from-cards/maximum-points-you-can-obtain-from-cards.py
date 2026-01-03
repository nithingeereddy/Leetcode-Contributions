class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        lsum=rsum=sum=maxi=0
        for i in range(k):
            lsum+=cardPoints[i]
        
        maxi=lsum
        n=len(cardPoints)-1
        for i in range(k-1,-1,-1):
            lsum-=cardPoints[i]
            rsum+=cardPoints[n]
            n-=1
            maxi=max(maxi,lsum+rsum)
        return maxi
        

       