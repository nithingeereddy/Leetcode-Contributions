class Solution {
    public static int fun(int nums[],int t){
        int c=0;
        for(int x:nums){
            if(x<t) c++;
        }
        return c;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a[]=new int[nums.length];
        int i=0;
        for(int x:nums){
            a[i]=fun(nums,x);
            i++;
        }
        return a;
    }
}