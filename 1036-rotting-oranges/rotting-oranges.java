class Pair{
    int r;
    int c;
    int t;
    Pair(int r,int c,int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int cnt=0;
        Queue<Pair> q=new LinkedList<>();
        int visit[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visit[i][j]=2;
                }
                else if(grid[i][j]==1){
                    cnt++;
                }
            }
        }

        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int tm=0,f=0;
        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            int t=q.peek().t;
            q.poll();
            tm=Math.max(tm,t);
            for(int i=0;i<4;i++){
                int rr=r+drow[i];
                int cc=c+dcol[i];
                if(rr<row && rr>=0 && cc<col && cc>=0 && grid[rr][cc]==1 && visit[rr][cc]!=2){
                    q.add(new Pair(rr,cc,t+1));
                    visit[rr][cc]=2;
                    f++;
                }
            }
        }
        return f==cnt?tm:-1;
    }
}