class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int pref=0,max=0,min=0;
        for(int x:nums){
            pref+=x;
            if(max<pref) max=pref;
            if(min>pref) min=pref;
        }
        return Math.abs(max-min);
    }
}