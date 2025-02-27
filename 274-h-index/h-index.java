class Solution {
    public int hIndex(int[] citations) {
        int t=0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            if(citations.length-i<=citations[i]){
                t=citations.length-i;
                break;
            }
        }
        return t;
    }
}