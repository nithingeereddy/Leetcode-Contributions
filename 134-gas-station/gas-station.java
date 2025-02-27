class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int curr_gas=0,start_in=0,total_cost=0,total_gas=0,c=0;
       for(int i=0;i<gas.length;i++){
        total_cost+=cost[i];
        total_gas+=gas[i];
       }

       if(total_gas<total_cost) return -1;
       for(int i=0;i<gas.length;i++){
        curr_gas+=gas[i]-cost[i];
        if(curr_gas<0){
            start_in=i+1;
            curr_gas=0;
            c=0;
        }else{
            c++;
        }
       }
       System.out.println(c+" "+start_in);
       return start_in;
        
    }
}