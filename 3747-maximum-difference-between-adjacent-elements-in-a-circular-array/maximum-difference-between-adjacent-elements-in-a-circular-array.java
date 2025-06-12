class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1){
                diff=Math.abs(nums[i]-nums[i+1]);
            }
            else{
                diff=Math.abs(nums[i]-nums[(i+1)%nums.length]);
            }
            max=Math.max(max,diff);
        }
        return max;
    }
}