class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twe=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                if(five>0){ 
                    five-=1;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten>0 && five>0){
                    twe++;
                    ten--;
                    five--;
                }
                else if(five>=3){
                     twe++;
                     five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}