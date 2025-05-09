class Solution {
    public int fact[],ifact[],dp[][][];
    public int N,MOD=(int)1e9+7;
    public int getExpoPower(int base,int exp){
        int result=1;
        while(exp!=0){
            if((exp&1)==1) result=(int)((1l*result*base)%MOD);
            base=(int)((1l*base*base)%MOD);
            exp>>=1;
        }
        return result;
    }
    public int solve(int[] freq,int cnum,int eltdiff,int sumdiff){
        if(dp[cnum][N+eltdiff][9*N+sumdiff]!=-1) 
            return dp[cnum][N+eltdiff][9*N+sumdiff];
        if(cnum==10){
            if(sumdiff==0){
                if((N&1)==0) return eltdiff==0?1:0;
                else return eltdiff==1?1:0;
            }
            return 0;
        }
        int total=0;
        for(int lelts=0;lelts<=freq[cnum];lelts++){
            int relts=freq[cnum]-lelts;
            int ifactsProd=(int)((1l*ifact[lelts]*ifact[relts])%MOD);
            int val=(int)((1l*solve(freq,cnum+1,eltdiff+lelts-relts,sumdiff+(lelts-relts)*cnum)*ifactsProd)%MOD);
            total=(int)((0l+total+val)%MOD);
        }
        return dp[cnum][N+eltdiff][9*N+sumdiff]=total;
    }
    public int countBalancedPermutations(String num) {
        N=num.length();
        int freq[]=new int[10];
        for(char c: num.toCharArray()) freq[c-'0']++;
        fact=new int[N+1]; ifact=new int[N+1];
        fact[0]=1; ifact[0]=1;
        for(int i=1;i<fact.length;i++){
            fact[i]=(int)((1l*i*fact[i-1])%MOD);
            ifact[i]=getExpoPower(fact[i],MOD-2);
        }
        dp=new int[11][2*N+1][2*9*N+1];
        for(int i=0;i<11;i++){
            for(int j=0;j<dp[i].length;j++) Arrays.fill(dp[i][j],-1);
        }
        int numerator=(int)((1l*fact[(N+1)/2]*fact[N/2])%MOD);
        int ans=(int)((1l*numerator*solve(freq,0,0,0))%MOD);
        return ans;
    }
}