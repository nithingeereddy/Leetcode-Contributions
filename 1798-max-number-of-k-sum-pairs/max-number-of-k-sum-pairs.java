class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1,c=0;
        while(l<r){
            if(nums[l]+nums[r]==k){
                 c++;
                     nums[l]=0;
                     nums[r]=0;
                 l++;
                 r--;
             
            }
            else if(nums[l]+nums[r]>k){
            r--;
            }
            else{
                l++;
            }
        }


return c;
    }
}