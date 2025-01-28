//Here we want to find the maximum fish that can be found within and adjacent cells

// so we use dfs
// we take a m*n matrix initially with false values(visited) and check whether the value in the given matrix is >1 and (not visited) in visited matrix
// if true then simply make the cell true and check the adjacent cells that have  not true and >1 conditions
// for the adjacent cells we take a array dir=-1,0,1,0,-1
// and take a for loop to initalise from 0 to 4 and for each newX and newY just check it is in valid indices and not visited and and value is >0
// and recursively call for another value and return it 
// and lastly find the maximum value out of the values

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
