class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length,col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(i,j,board,0,word)) return true;
            }
        }
        return false;
    }
    public static boolean dfs(int i,int j,char board[][],int index,String word){
        if(index==word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)) return false;

        char temp=board[i][j];
        board[i][j]='#';
        boolean found=dfs(i+1,j,board,index+1,word) ||
        dfs(i-1,j,board,index+1,word) ||
        dfs(i,j+1,board,index+1,word) ||
        dfs(i,j-1,board,index+1,word);
        board[i][j]=temp;

        return found;


    }
}