class Solution {
    public String maskIt(String s){
        String t="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                t+="*";
                continue;
            }
            t+=s.charAt(i);
        }
        return t;
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactMatch=new HashSet<>(Arrays.asList(wordlist));
        Map<String,String> caseIn=new HashMap<>();
        Map<String,String> transform=new HashMap<>();
        for(String word:wordlist){
            String lower=word.toLowerCase();
            String mask=maskIt(lower);
            caseIn.putIfAbsent(lower,word);
            transform.putIfAbsent(mask,word);
        }
        String result[]=new String[queries.length];
        for(int i=0;i<queries.length;i++){
            if(exactMatch.contains(queries[i])){
                result[i]=queries[i];
                continue;
            }
            String l=queries[i].toLowerCase();
            String m=maskIt(l);
            if(caseIn.containsKey(l)){
                result[i]=caseIn.get(l);
                continue;
            }
            if(transform.containsKey(m)){
                result[i]=transform.get(m);
                continue;
            }
            result[i]="";
        }
        return result;
    }
}