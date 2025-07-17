class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character,Integer> h1=new HashMap<>();
        Map<Character,Integer> h2=new HashMap<>();
        for(char c:word1.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        for(char c:word2.toCharArray()){
            h2.put(c,h2.getOrDefault(c,0)+1);
        }

        if (!h1.keySet().equals(h2.keySet())) return false;

        
        List<Integer> freq1 = new ArrayList<>(h1.values());
        List<Integer> freq2 = new ArrayList<>(h2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}