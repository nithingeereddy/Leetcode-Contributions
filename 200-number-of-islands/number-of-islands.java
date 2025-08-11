class Pair{
    int r=0;
    int c=0;
    Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public static void bfs(int visit[][],char grid[][],int r,int c){
        visit[r][c]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));
        while(!q.isEmpty()){
            int first=q.peek().r;
            int second=q.peek().c;
            q.poll();
            int drow[]={-1,0,+1,0};
            int dcol[]={0,+1,0,-1};
                  for(int i=0;i<4;i++){
                    int row=first+drow[i];
                    int col=second+dcol[i];
                    if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]=='1' && visit[row][col]==0){
                        visit[row][col]=1;
                        q.add(new Pair(row,col));
                    }
                  }
                }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        int visit[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visit[i][j]==0 && grid[i][j]=='1'){
                    bfs(visit,grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
}