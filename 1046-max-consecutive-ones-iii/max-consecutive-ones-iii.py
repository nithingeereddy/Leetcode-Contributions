class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        zeros=l=r=maxi=0
        while r<len(nums):
            if(nums[r]==0):
                zeros+=1
            while(zeros>k):
                if nums[l]==0:
                    zeros-=1
                l+=1
            if(zeros<=k):
                maxi=max(maxi,r-l+1)
            r+=1
        return maxi