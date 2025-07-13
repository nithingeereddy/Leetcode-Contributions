class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String p=str1+""+str2;
        String q=str2+""+str1;
        if(!p.equals(q)) return "";
        int size=gcd(str1.length(),str2.length());
        return str1.substring(0,size);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}