class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=k-1,r=cardPoints.length-1,max=0,lsum=0,rsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        max=lsum;
        int maxLen=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[maxLen--];
            max=Math.max(max,lsum+rsum);
        }
return max;

    }
    
}