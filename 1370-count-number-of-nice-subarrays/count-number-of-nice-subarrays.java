class Solution {
    public int num(int[] nums,int k){
         int l=0,r=0,cnt=0,sum=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            if(sum<0) return 0;
            while(sum>k){
                sum-=nums[l]%2;
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return num(nums,k)-num(nums,k-1);
    }
}