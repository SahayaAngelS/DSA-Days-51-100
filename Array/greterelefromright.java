
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
int ans[]=new int[n];
int max=-1;
for(int i=n-1;i>=0;i--)
{    ans[i]=max;
    int temp=arr[i];
    
    if(temp>max)
    {
        max=arr[i];
    }
    
}
return ans;
    }
public class greterelefromright {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[]res=replaceElements(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
