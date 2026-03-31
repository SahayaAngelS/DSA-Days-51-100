import java.util.PriorityQueue;
import java.util.*;
public class kthlargest {
    static int largest(int[]arr,int k)
    {
        PriorityQueue<Integer>heap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            if(heap.size()<k||arr[i]>heap.peek())
            {
                heap.add(arr[i]);
                if(heap.size()>k)
                {
                    heap.poll();
                }
            }
        }
        return heap.poll();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);3
        
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=largest(arr,k);
        System.out.println(res);

    }
}
