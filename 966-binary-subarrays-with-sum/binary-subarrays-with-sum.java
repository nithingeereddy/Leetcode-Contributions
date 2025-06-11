class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int sum=0,count=0;
        for(int num:nums){
            sum+=num;
            if(m.containsKey(sum-goal)){
                count+=m.get(sum-goal);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return count;
    }
}