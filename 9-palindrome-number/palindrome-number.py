class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=str(x)
        s1=""
        for i in range(len(s)-1,-1,-1):
            s1+=s[i]
        return s==s1