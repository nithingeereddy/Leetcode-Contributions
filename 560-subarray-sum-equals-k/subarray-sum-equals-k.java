class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int diff=sum-k;
            if(m.containsKey(diff)){
                count+=m.get(diff);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return count;
    }
}