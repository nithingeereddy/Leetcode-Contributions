class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int x:nums){
            if(x>0)
            s.add(x);
        }
        return s.size();
    }
}