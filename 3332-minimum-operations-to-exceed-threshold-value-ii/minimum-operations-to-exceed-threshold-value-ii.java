class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap=new PriorityQueue<>();
        for(long num:nums){
           minHeap.add(num);

        }
        int c=0;
        while(minHeap.size()>1 && minHeap.peek()<k){
            Long x=minHeap.poll();
            Long y=minHeap.poll();
            Long z=x*2+y;
            minHeap.add(z);
            c++;
        }
        return c;
    }
}