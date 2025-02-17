class Solution {
    public int numTilePossibilities(String tiles) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c:tiles.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        return dfs(m);
    }
    public int dfs(HashMap<Character,Integer> m)
    {
        int count=0;
        for(char c:m.keySet()){
            if(m.get(c)>0){
            count++;
             m.put(c,m.get(c)-1);
             count+=dfs(m);
             m.put(c,m.get(c)+1);
        }
        }
        return count;

    }
}