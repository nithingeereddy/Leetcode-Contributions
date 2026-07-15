class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        l,r,maxLen,zeros=0,0,0,0
        while(r<len(nums)):
            if nums[r]==0:
                zeros+=1
            if zeros<=k:
                maxLen=max(maxLen,r-l+1)
            if zeros>k:
                if nums[l]==0:
                    zeros-=1
                l+=1
            r+=1
        return maxLen
        