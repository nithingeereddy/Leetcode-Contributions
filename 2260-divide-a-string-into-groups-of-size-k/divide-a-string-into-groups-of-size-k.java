class Solution
{
    public String[] divideString(String s, int k, char fill)
    {
        StringBuilder b = new StringBuilder(s);
        
        while(b.length()%k!=0)
            b.append(fill);

        int l = b.length();
        String [] r = new String[l/k];

        for(int i=0; i<l; i+=k)
            r[i/k] = b.substring(i,i+k);

        return r;
    }
}