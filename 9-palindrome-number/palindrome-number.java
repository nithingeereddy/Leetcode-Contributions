class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,rem=0,t=x;
        while(x!=0){
            rem=Math.abs(x%10);
            rev=rev*10+rem;
            x/=10;
        }
        return rev==t;
    }
}