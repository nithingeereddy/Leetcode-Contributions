class Solution {
    public int longestSubsequence(String s, int k) {
        //count 0
      int i = 0, maxLen = 0;
while (s.length() - i > 30) if (s.charAt(i++) == '0') maxLen++;
while (Integer.parseInt(s.substring(i), 2) > k) if (s.charAt(i++) == '0') maxLen++;
return maxLen + s.length() - i;

       
    }
}