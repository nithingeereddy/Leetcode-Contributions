class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> s1=new HashSet<>();
        int l=0,r=0,m=0;
        while(r<s.length()){
            while(s1.contains(s.charAt(r))){
                s1.remove(s.charAt(l));
                l++;
            }
            s1.add(s.charAt(r));
            m=Math.max(m,r-l+1);
            r++;
        }
return m;
    }
}