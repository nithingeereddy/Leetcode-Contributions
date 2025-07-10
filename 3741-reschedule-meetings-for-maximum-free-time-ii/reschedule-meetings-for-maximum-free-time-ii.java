class Solution {
    public int maxFreeTime(int eventTime, int[] s, int[] e) {

        int n = s.length;
        
        int m = n+1;

        int[] prel = new int[m];
        int[] prer = new int[m];

        int[] diff = new int[m];

        diff[0] = s[0]-0;
        diff[n] = eventTime-e[n-1];
        
        for(int i=1;i<n;i++){
            diff[i] = s[i] - e[i-1];
            prel[i] = Math.max(prel[i-1], diff[i-1]);

            
        }

        for(int i=n-2;i>=0;i--){

            if(i+2<m)
            prer[i] = Math.max(prer[i+1], diff[i+2]);

        }

        
        int res=0;

        for(int i=0;i<n;i++){
            
            int a = diff[i];
            int b = diff[i+1];

            int sum = a+b;
            int c = e[i]-s[i];

            if( prel[i]>=c || (  prer[i]>=c)){
                sum+=c;
            }

            res = Math.max(res, sum);

        }

        return res;
    }
}