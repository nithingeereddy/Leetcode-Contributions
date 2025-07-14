class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        int l=0,r=words.length-1;
        String s1="";
        while(l<r){
            swap(words,l,r);
            l++;r--;
        }
         s1=String.join(" ",words);
       return s1;
    }
    public void swap(String[] words,int l,int r){
        String t=words[l];
        words[l]=words[r];
        words[r]=t;
    }
}