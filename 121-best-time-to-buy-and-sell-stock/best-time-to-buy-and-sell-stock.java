class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,profit=0,max=0;
        while(l<r && r<prices.length){
            if(prices[l]<prices[r]){
                profit=Math.abs(prices[l]-prices[r]);
                max=max<profit?profit:max;
            }
            else{
                l=r;
            }
            r++;
        }
        return max;
    }
}