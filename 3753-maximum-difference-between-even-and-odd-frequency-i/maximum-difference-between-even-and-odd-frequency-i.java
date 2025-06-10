class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                m.put(s.charAt(i),1);
            }
        }
       int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int freq : m.values()) {
            if (freq % 2 == 1) {
                maxOdd = Math.max(maxOdd, freq);
            } else {
                minEven = Math.min(minEven, freq);
            }
        }

        // Return max difference
        return maxOdd - minEven;
    }
}