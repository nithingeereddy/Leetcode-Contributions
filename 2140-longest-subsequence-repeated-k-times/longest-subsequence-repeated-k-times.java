class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        List<Character> list = new ArrayList<>();
        for(int i=25;i>=0;i--){
            if(freq[i]>=k){
                list.add((char)('a'+i));
            }
        }
        Queue<String> q = new LinkedList<>();
        for(char c:list){
            q.add(String.valueOf(c));
        }
        String ans = "";
        while(!q.isEmpty()){
            String cur = q.poll();
            if(cur.length() > ans.length()){
                ans = cur;
            }
            for(char c:list){
                String nxt = cur+c;
                if(isKRepeatedSubsequence(s,nxt,k)){
                    q.add(nxt);
                }
            }
        }
        return ans;
    }
    private boolean isKRepeatedSubsequence(String s,String t,int k){
        int pos = 0, matched = 0, m = t.length();
        for(char c:s.toCharArray()){
            if(c == t.charAt(pos)){
                pos++;
                if(pos==m){
                    pos = 0;
                    matched++;
                    if(matched == k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}