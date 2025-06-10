class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                m.put(s.charAt(i),1);
            }
        }
      int odd=Integer.MIN_VALUE,even=Integer.MAX_VALUE;
      for(int x:m.values()){
        if(x%2==0) even=Math.min(even,x);
        else odd=Math.max(odd,x);
      }
      return odd-even;
    }
}