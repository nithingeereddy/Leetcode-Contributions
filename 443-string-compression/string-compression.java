class Solution {
    public int compress(char[] c1) {
        int c=0,index=0,i=0;
        while(i<c1.length){
            char current=c1[i];
            while(i<c1.length && c1[i]==current){
                c++;
                i++;
            }
            c1[index++]=current;
            if(c>1){
            for(char c2:Integer.toString(c).toCharArray()){
            c1[index++]=c2;
            }
            

        }
        c=0;
        }
        return index;
    }
}