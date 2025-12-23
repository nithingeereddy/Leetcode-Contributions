class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int freq[]=new int[nums.length+1];
        int c=0;
        for(int x:nums){
            freq[x]++;
        }
        List<Integer> l1=new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i] == 0) {
                l1.add(i);  
            }
        }
       return l1;
    }
}