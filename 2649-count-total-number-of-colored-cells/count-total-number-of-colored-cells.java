class Solution {
    public long coloredCells(int n) {
        long s=0,s1=1;
        for(int i=0;i<n;i++){
            if(n==1) return s1;
            else if(n>1 && i>=1){
                s+=4;
                s1+=s;
            }
        }
        return s1;
    }
}