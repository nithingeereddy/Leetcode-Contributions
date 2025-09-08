class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
            int t=n-a;
            String t1=""+t;
            String t2=""+a;
            if(t1.indexOf("0")==-1 && t2.indexOf("0")==-1){
                return new int[]{a,t};
            }
        }
        return new int[]{};
    }
}