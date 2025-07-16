class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        Set<Integer> h1=new HashSet<>();
        Set<Integer> h2=new HashSet<>();
       for(int x:nums1){
        h1.add(x);
       }
       for(int x:nums2){
        h2.add(x);
       }

        for(int i:h2){
            if(!h1.contains(i)) l1.add(i);
        }
         for(int i:h1){
            if(!h2.contains(i)) l2.add(i);
        }

       return Arrays.asList(l2,l1);


    }
}