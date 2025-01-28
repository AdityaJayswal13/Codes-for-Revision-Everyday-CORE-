class Solution {
    int[] dir={-1,0,1,0,-1};
    public boolean isValid(int x,int y,int m,int n){
        return (x>=0 && x<m && y>=0 && y<n);
    }
    public int dfs(int[][] grid,boolean[][] visited ,int m, int n,int x,int y){
        int fish_count=grid[x][y];
        for(int i=0;i<4;i++){
            int newX=x+dir[i];
            int newY=y+dir[i+1];
            if(isValid(newX,newY,m,n) && !visited[newX][newY] && grid[newX][newY]>0){
                visited[newX][newY]=true;
                fish_count+=dfs(grid,visited,m,n,newX,newY);
            }
        }
        return fish_count;
    }
    public int findMaxFish(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max_fish=0;
        boolean[][] visited=new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]>0){
                    visited[i][j]=true;
                    max_fish=Math.max(max_fish,dfs(grid,visited,m,n,i,j));
                }
            }
        }
        return max_fish;
        
    }
}