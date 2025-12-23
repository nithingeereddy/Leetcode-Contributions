class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1,miss=-1;
        int freq[]=new int[nums.length+1];
       for(int x:nums){
        freq[x]++;
        if(freq[x]==2) dup=x;
       }
       

        for(int i=1;i<=nums.length;i++){
            if(freq[i]==0){
                 miss=i;
                 break;
            }

        }
        return new int[]{dup,miss};
    }
}