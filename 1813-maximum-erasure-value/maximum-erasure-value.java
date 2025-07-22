class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int sum=0,l=0,r=0,max=0;
        while(r<nums.length){
            while(s.contains(nums[r])){
                s.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            sum+=nums[r];
            s.add(nums[r]);
            max=Math.max(max,sum);
            r++;
        }
        return max;
    }
}