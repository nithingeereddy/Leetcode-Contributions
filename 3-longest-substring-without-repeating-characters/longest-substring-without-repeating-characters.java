class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int l = 0, r = 0, maxLen = 0;

        while (r < s.length()) {
            char c = s.charAt(r);

            // Fix 1: only move `l` forward if duplicate character index is >= l
            if (m.containsKey(c) && m.get(c) >= l) {
                l = m.get(c) + 1;
            }

            // Fix 2: always store current index `r` of the character
            m.put(c, r);

            // Fix 3: always update maxLen
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
}
