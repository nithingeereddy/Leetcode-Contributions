class Solution {
    public String removeOccurrences(String s, String part) {
        int i=0;
        while(s.length()!=0 && i+part.length()<=s.length()){
            int l=s.length();
            int p=part.length();
            String m="";
            if(s.substring(i,i+p).equals(part)){
                s=s.substring(0,i)+""+s.substring(p+i,l);
                System.out.println(s);
                i=0;
            }else{
            i++;
            }
        }
        return s;
    }
}