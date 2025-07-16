class Solution {
    public int largestAltitude(int[] gain) {
        int a[]=new int[gain.length+1];
        a[0]=0;
        int m=0;
        for(int i=1;i<=gain.length;i++){
            a[i]=a[i-1]+gain[i-1];
            m=Math.max(m,a[i]);
        }
        return m;
    }
}