class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }

int max=0;
        for(int key:m.keySet()){
            if(m.containsKey(key+1)){
                int f=m.get(key)+m.get(key+1);
                max=Math.max(f,max);
            }
        }

        return max;

    }
}