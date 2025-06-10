class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int l=0,r=0,max=0;
        while(r<s.length()){
            if(m.containsKey(s.charAt(r)) && m.get(s.charAt(r))>=l){
                l=m.get(s.charAt(r))+1;
            }
                m.put(s.charAt(r),r);
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}