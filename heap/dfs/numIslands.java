package dfs;

public class numIslands {
    public int NnumIslands(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    count(grid,i,j);
                }
            }
        }
        return count;
    }
    private static void count(char[][]grid,int i,int j)
    {
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || i>=m||j<0 || j>=n||grid[i][j]!='1' )
        {
            return;
        }
        grid[i][j]='2';
        count(grid,i-1,j);
        count(grid,i,j-1);
        count(grid,i,j+1);
        count(grid,i+1,j);
    }
}
