class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,m=0,c=0,f=0;
        while(r<nums.length){
            if(nums[r]==0){
                c++;
                f=1;
            }
            if(c>1){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            m=Math.max(m,r-l);
            r++;
        }
        return m;
    }
}