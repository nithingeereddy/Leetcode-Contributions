class Pair{
    int r,c,tm;
    Pair(int r,int c,int tm){
        this.r=r;
        this.c=c;
        this.tm=tm;
    }
}
class Solution {

    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;
        Queue<Pair> q=new LinkedList<>();
        int visit[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visit[i][j]=2;
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int drow[]={-1,0,+1,0};
        int dcol[]={0,+1,0,-1};
        int cnt=0,tm=0;
        while(!q.isEmpty()){
        int r=q.peek().r;
        int c=q.peek().c;
        int t=q.peek().tm;
        tm= Math.max(t,tm);
       
        q.poll();
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if(nrow>=0 && nrow<row && ncol>=0 && ncol<col && visit[nrow][ncol]!=2 && grid[nrow][ncol]==1 ){
                visit[nrow][ncol]=2;
                q.add(new Pair(nrow,ncol,t+1));
                cnt++;
            }
        }
    }
    return fresh==cnt?tm:-1;
}
}