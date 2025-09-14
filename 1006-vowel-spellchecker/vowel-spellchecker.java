class Solution {
    final Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
    public String vowelMask(String s){
        String t="";
        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                t+='*';
                continue;
            }
            t+=s.charAt(i);
        }
        return t;
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactMatch=new HashSet<>(Arrays.asList(wordlist));
        Map<String,String> caseInsen = new HashMap<>();
        Map<String,String> ms=new HashMap<>();
        for(String word:wordlist){
            String lower=word.toLowerCase();
            String masked=vowelMask(lower);
            caseInsen.putIfAbsent(lower,word);
            ms.putIfAbsent(masked,word);   
        }
        String a[]=new String[queries.length];
        for(int i=0;i<queries.length;i++){
            if(exactMatch.contains(queries[i])){
                a[i]=queries[i];
                continue;
            }
            String l=queries[i].toLowerCase();
            String m=vowelMask(l);
            if(caseInsen.containsKey(l)){
                a[i]=caseInsen.get(l);
                continue;
            }
            
            if(ms.containsKey(m)){
                a[i]=ms.get(m);
                continue;
            }

            a[i]="";
        }
        return a;
    }
}