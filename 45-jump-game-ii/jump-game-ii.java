class Solution {
    public int jump(int[] nums) {
        int coverage=0,t=0,lastVisited=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length-1;i++){
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastVisited){
                lastVisited=coverage;
                t++;
            }
        }
        return t;
    }
}