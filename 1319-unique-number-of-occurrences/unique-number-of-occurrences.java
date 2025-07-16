class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int i:arr){
           m.put(i,m.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> m1:m.entrySet()){
            if(s.contains(m1.getValue())){
                return false;
            }
            s.add(m1.getValue());
        }
        return true;
    }
}