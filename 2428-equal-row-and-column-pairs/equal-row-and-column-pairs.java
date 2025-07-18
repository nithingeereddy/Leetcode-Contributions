class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        Map<List<Integer>,Integer> grid_row=new HashMap<>();
        Map<List<Integer>,Integer> grid_col=new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            List<Integer> col=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(grid[i][j]);
                col.add(grid[j][i]);
            }
            grid_row.put(row,grid_row.getOrDefault(row,0)+1);
            grid_col.put(col,grid_col.getOrDefault(col,0)+1);
        }
        int ans=0;
        for(var x:grid_row.entrySet()){
            if(grid_col.containsKey(x.getKey())){
                ans+=x.getValue()*grid_col.get(x.getKey());
            }
        }
        return ans;
    }
}