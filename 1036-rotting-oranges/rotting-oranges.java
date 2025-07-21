class Pair{
    int r=0;
    int c=0;
    int tm=0;
    Pair(int r,int c,int tm){
        this.r=r;
        this.c=c;
        this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visit[][]=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    visit[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int t=0,cnt=0,tm=0;
        int drow[]={-1,0,+1,0};
        int dcol[]={0,+1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            t=q.peek().tm;
            tm=Math.max(t,tm);
            q.remove();
            for(int i=0;i<4;i++){
                int row=r+drow[i];
                int col=c+dcol[i];
                if(row<n && row>=0 && col<m && col>=0 && visit[row][col]==0 && grid[row][col]==1){
                    visit[row][col]=2;
                    q.add(new Pair(row,col,t+1));
                    cnt++;
                }
            }
        }
        if(fresh!=cnt) return -1;

        return tm;
    }
}