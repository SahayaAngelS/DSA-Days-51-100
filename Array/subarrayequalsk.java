import java.util.*;
public class subarrayequalsk
{
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
    private static int subarray(int[]arr,int n, int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {sum+=arr[i];
            if(sum==k)
            {
                max=Math.max(max,i+1);
            }
            if(map.containsKey(sum-k))
            {
                max=Math.max(max,i-map.get(sum-k));
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }

        }
        return max;
    }

}