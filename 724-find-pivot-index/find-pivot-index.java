class Solution {
    public int pivotIndex(int[] nums) {
        int s=0,lsum=0,rsum=0;
        for(int x:nums){
            s+=x;
        }
        for(int i=0;i<nums.length;i++){
            rsum=s-lsum-nums[i];
            if(lsum==rsum) return i;
            lsum+=nums[i];
        }
        return -1;
    }
}