class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack=new ArrayDeque<>();
        String s[]=path.split("/");
        for(String s1:s){
            if(s1.isEmpty() || s1.equals(".")) continue;
            if(s1.equals("..")){ 
                if(!stack.isEmpty())stack.pop();
            }
            else{
                stack.push(s1);
            }
        }

        return convertToString(stack);
    }
    public static String convertToString(Deque<String> stack){
        StringBuilder s=new StringBuilder();
        while(!stack.isEmpty()){
            s.append("/").append(stack.removeLast());
        }
        if(s.length()==0) s.append("/");
        return s.toString();
    }
}