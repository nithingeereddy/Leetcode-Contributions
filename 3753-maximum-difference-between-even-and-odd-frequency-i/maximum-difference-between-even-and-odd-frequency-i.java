class Solution {
    public int maxDifference(String s) {
        int a[]=new int[26];
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }

        int even=Integer.MAX_VALUE,odd=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(a[i]%2==0 && a[i]>0){
                even=Math.min(even,a[i]);
            }
            else{
                odd=Math.max(odd,a[i]);
            }
        }
        return odd-even;
    }
}