/*Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.*/
import java.util.*;
public class negativecountinmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ar[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
       int ans= count(ar,n,m);
       System.out.println(ans);
    }
    static int count(int [][]arr,int r,int c)
    {
        int cnt=0;
        int row=0;
        int col=c-1;
        while(row<r && col>=0)
        {
            if(arr[row][col]<0)
            {
                cnt+=r-row;
                col=col-1;

            }
            else{
                row++;
            }
        }
        return cnt;

    }
    
}
