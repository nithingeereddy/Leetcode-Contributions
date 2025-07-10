class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int sum=0;
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        for(int i=0;i<s.length();i++){
           int curr=m.get(s.charAt(i));
           int next=(i+1<s.length())?m.get(s.charAt(i+1)):0;
           if(curr<next){
            sum-=curr;
           }
           else{
            sum+=curr;
           }
        }
        return Math.abs(sum);
    }
}