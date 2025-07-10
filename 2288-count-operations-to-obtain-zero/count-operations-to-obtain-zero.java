class Solution {
    public int countOperations(int num1, int num2) {
        if (num2 < num1) return countOperations(num2, num1); 
        
        int ans = 0;
        int t = 0;

        while (num1 != 0 && num2 != 0) {
            ans += num2 / num1;               
            t = num2 % num1;                   
            num2 = Math.max(num1, t);        
            num1 = Math.min(num1, t);
        }

        return ans;
    }
}