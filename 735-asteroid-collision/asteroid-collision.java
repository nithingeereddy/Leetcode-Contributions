class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
       for(int i=0;i<asteroids.length;i++){
        if(st.isEmpty() || asteroids[i] >0){
            st.push(asteroids[i]);
        }
        else{
            while(true){
                if(st.peek()<0){
                    st.push(asteroids[i]);
                    break;
                }
                else if(st.peek()==-asteroids[i]){
                    st.pop();
                    break;
                }
                else if(st.peek()>-asteroids[i]){
                    break;
                }
                else{
                    st.pop();
                    if(st.isEmpty()){
                        st.push(asteroids[i]);
                        break;
                }

            }
        }
       }
       }
        int r[]=new int[st.size()];
        for(int i=0;i<r.length;i++){
            r[i]=st.get(i);
        }
        return r;
    }
}