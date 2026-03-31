package arrays;

class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[][]bool=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    bool[i][j]=true;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(bool[i][j]==true)
                {
                    for(int r=i,c=0;c<n;c++)
                    {
                        matrix[r][c]=0;
                    }
                    for(int c=j,r=0;r<m;r++)
                    {
                        matrix[r][c]=0;
                    }
                }
            }
        }
    }
}