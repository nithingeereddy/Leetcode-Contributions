class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0;
        double m=Double.NEGATIVE_INFINITY,s=0;
        while(r<nums.length){
             s+=nums[r];
            while(r-l+1>k){
                s-=nums[l];
                l++;
            }
           if(r-l+1==k)
            m=Math.max(m,s);
            r++;
        }
        return m/k;
    }
}