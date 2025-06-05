class Solution {
    private int[] parent;
    private int find(int x)
    {
        if(parent[x]!=x)
        {
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int len=s1.length();
        parent=new int[26];
        
        for(int i=0;i<26;i++)
        {
            parent[i]=i;
        }

        for(int i=0;i<len;i++)
        {
            int u=s1.charAt(i)-'a';
            int v=s2.charAt(i)-'a';
            int pu=find(u);
            int pv=find(v);

            if(pu<pv)
            {
                parent[pv]=pu;
            }
            else
            {
                parent[pu]=pv;
            }
        }

        StringBuilder result=new StringBuilder();
        for(char ch:baseStr.toCharArray())
        {
            char mapped=(char)(find(ch-'a')+'a');
            result.append(mapped);
        }
        return result.toString();
    }
}