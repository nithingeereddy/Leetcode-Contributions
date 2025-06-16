class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]<nums[j]){
                int max=Math.abs(nums[i]-nums[j]);
                maxDiff=Math.max(max,maxDiff);
            }
        }
        }
        return maxDiff==0?-1:maxDiff;
    }
}