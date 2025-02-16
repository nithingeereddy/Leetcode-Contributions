class Solution {
    static boolean filled;

    public static int[] constructDistancedSequence(int n) {


        filled = false;

        int[] ans = new int[2*n-1];
        boolean[] incl = new boolean[n+1];
        return helper(ans, 0, incl);
    }

    private static int[] helper(int[] ans, int curIndex, boolean[] incl){
        if(filled){
            return ans; //answer
        }
        for(int k= 1; k< incl.length; k++){
            if(!incl[k]) break;
            else if(k == incl.length-1) {
                filled = true;
                return ans;
            }
        }

        for(int i = incl.length-1; i>=1 ; i--){
            if(incl[i]) continue;
            if(curIndex >= ans.length) break;
            while(ans[curIndex]!=0) curIndex++;

            if(i == 1){
                ans[curIndex] = 1;
                incl[i] = true;
                int[] temp_ans = helper(ans, curIndex+1, incl);
                if(filled) return temp_ans;

                incl[i] = false;
                ans[curIndex] = 0;
            }

            if(curIndex + i < ans.length){
                if(ans[curIndex + i]!=0){
                    continue;
                }
                else{
                    ans[curIndex] = i;
                    ans[curIndex + i] = i;
                    incl[i] = true;

                    int[] temp_ans = helper(ans, curIndex+1, incl);
                    if(filled) return temp_ans;

                    ans[curIndex] = 0;
                    ans[curIndex + i] = 0;
                    incl[i] = false;
                }
            }
            else{
                return ans; //backtrack
            }
        }

        return ans;
    }
}