class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros=0,l=0,r=0,m=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            m=Math.max(m,r-l+1);
            r++;
        }
        return m;
    }
}