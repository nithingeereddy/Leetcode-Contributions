class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=0;
        while(r<nums.length){
            if(nums[r]!=0){
                int t=nums[r];
                nums[r]=nums[l];
                nums[l]=t;
                l++;
            }
            r++;
        }
    }
}