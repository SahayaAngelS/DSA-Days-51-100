import java.util.Scanner;
public class subarrayequalskXOR {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
        int res=subarray(arr,n,k);
        System.out.println(res);

    }
    private static int subarray(int[]arr,int n,int k)
    { int count=0;
        for(int i=0;i<n;i++)
        {
            int xor=0;
            for(int j=i;j<n;j++)
            {
                xor=xor^arr[j];
                if(xor==k)
                {
                    count++;
                }
            }
        }
        return count;
    }
    
}
