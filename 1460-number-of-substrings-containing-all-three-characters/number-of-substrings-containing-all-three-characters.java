class Solution {
    public int numberOfSubstrings(String s) {
        int lastSeen[]={-1,-1,-1};
        int l=0,r=0,c=0;
        while(r<s.length()){
            lastSeen[s.charAt(r)-'a']=r;
            if(lastSeen[0]>-1 && lastSeen[1]>-1 && lastSeen[2]>-1){
                c+=Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]))+1;
            }
            r++;
        }
        return c;
    }
}