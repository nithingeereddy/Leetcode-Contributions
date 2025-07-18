class Solution {
    public String decodeString(String s) {
        Stack<Integer> ct=new Stack<>();
        Stack<String> st=new Stack<>();
        int c=0,r=0;
        String res="";
        while(r<s.length()){
            c=0;
            if(Character.isDigit(s.charAt(r))){
            while(Character.isDigit(s.charAt(r))){
                c=10*c+(s.charAt(r)-'0');
                r++;
            }
            ct.push(c);
            }
            if(s.charAt(r)=='['){
                st.push(res);
                res="";
                r++;
            }
            else if(s.charAt(r)==']'){
             StringBuilder t=new StringBuilder(st.pop());
             int cnt=ct.pop();
             for(int i=0;i<cnt;i++){
                t.append(res);
             }   
             res=t.toString();
             r++;
            }
            else{
                res+=s.charAt(r);
                r++;
            }
        }
        return res;
    }
}