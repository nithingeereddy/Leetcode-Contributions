class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        Map<Character,Integer> m=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            if(m.containsKey(c) && m.get(c)>=l){
                l=m.get(c)+1;
            }

            m.put(c,r);
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}