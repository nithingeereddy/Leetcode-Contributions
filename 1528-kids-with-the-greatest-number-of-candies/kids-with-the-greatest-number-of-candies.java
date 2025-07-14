class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> l1=new ArrayList<>();

        for(int x:candies){
            max=Math.max(max,x);
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                l1.add(true);
            }
            else{
                l1.add(false);
            }
        }
        return l1;
    }
}