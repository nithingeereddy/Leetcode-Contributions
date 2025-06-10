class Solution:
    def maxDifference(self, s: str) -> int:
        f=collections.Counter(s)

        odd_max=0
        even_min=1000
        for i in f.values():
            if i%2==0:
                even_min=min(even_min,i)
            else:
                odd_max=max(odd_max,i)
        return odd_max-even_min