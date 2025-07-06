class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        for(int num:nums2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        this.nums2=nums2;
    }
    
    public void add(int i, int val) {
        map.put(nums2[i],map.get(nums2[i])-1); 
        nums2[i]+=val; 
        map.put(nums2[i],map.getOrDefault(nums2[i],0)+1); 
    }
    
    public int count(int tot) {
        int count=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>tot)continue;
            if(map.containsKey(tot-nums1[i])) 
                count+=map.get(tot-nums1[i]);
        }
        return count;
    }
}

