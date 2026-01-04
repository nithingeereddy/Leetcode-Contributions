class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        l=r=maxi=0
        dic={}
        while(r<len(fruits)): 
            dic[fruits[r]]=dic.get(fruits[r],0) + 1
           
            while len(dic)>2:
                dic[fruits[l]]-=1
                if(dic[fruits[l]]==0):
                    del dic[fruits[l]]
                l+=1
            maxi=max(maxi,r-l+1)
            r += 1

        return maxi