class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=nums[r]%2;
           if(m.containsKey(sum-k)){
                count+=m.get(sum-k);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
            r++;
        }
    return count;
    }
}