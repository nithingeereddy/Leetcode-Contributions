class Solution:
    def doesAliceWin(self, s: str) -> bool:
        for i,j in enumerate(s):
            if s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u':
                return True;
        return False;