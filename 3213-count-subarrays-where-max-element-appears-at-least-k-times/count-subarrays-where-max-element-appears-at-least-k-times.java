class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max=Integer.MIN_VALUE,c=0,c1=0;
        int l=0,r=0;
        for(int x:nums) max=Math.max(x,max);

       for(r=0;r<nums.length;r++){
        if(nums[r]==max) c++;
        while(c>=k){
            if(nums[l]==max) c--;
            l++;
        }
        c1+=l;
       }
        return c1;
    }
}