class Solution {
    public int findPairs(int[] nums, int k) {
    Arrays.sort(nums);
    int i=0,j=1,pairs=0,n=nums.length;
    while(j<n){
        if(nums[j]-nums[i]==k){
            pairs++;
            i++;
            j++;
            while(j<n && nums[j]==nums[j-1]) j++;
        }
        else if(nums[j]-nums[i]>k){
            i++;
            if(j-i==0) j++;
        }
        else j++;
    }
    return pairs;    
    }
}