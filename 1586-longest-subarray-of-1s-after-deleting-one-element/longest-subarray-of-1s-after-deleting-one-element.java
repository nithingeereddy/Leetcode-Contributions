class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,m=0,t=0,f=0;
        while(r<nums.length){
            if(nums[r]==0){
                t++;
                f=1;
            }
            if(t>1){
                if(nums[l]==0){
                    t--;
                }
                l++;
            }
            if(t==1)
            m=Math.max(m,r-l+1);
            r++;
        }
        return f==0?nums.length-1:m-1;
    }
}