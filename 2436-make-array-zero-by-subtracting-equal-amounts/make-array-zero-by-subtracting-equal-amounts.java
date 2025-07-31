class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int min=0,f=0,c=0;
        if((nums.length==1 && nums[0]==0) || nums[nums.length-1]==0) return 0;
        for(int i=0;i<nums.length;i++){
            f=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>0 && f==0){
                    min=nums[j];
                    f=1;
                }
                if(f==1 &&nums[j]!=0)
                nums[j]-=min;
            }
            if(nums[nums.length-1]==0) return i+1;
        }
        return 0;
    }
}