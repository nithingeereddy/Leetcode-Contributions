class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> s1=new HashSet<>(wordDict);
        int maxLen=0;
        for(String t:s1){
            maxLen=Math.max(maxLen,t.length());
        }
        int n=s.length();
        boolean M[]=new boolean[n+1];
        M[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(0,i-maxLen);j--){
                if(M[j] && s1.contains(s.substring(j,i))) M[i]=true;
            }
        }
        return M[n];
    }
}