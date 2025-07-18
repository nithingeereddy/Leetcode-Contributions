class Solution {
    public String removeStars(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                s1.pop();
            }
            else{
            s1.push(c);
            }
        }
        StringBuilder s2=new StringBuilder();
        for(char c:s1){
            s2.append(c);
        }
        s=s2.toString();
        return s;
    }
}