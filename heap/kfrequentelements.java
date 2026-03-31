import java.util.PriorityQueue;
import java.util.*;
class kfrequentelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] res = topKFrequent(arr, k);

        for(int i=0;i<k;i++){
            System.out.println(res[i]);

    }
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int n=nums.length;
       PriorityQueue<Integer>max=new PriorityQueue<>((a,b)->(map.get(a)-map.get(b)));
       for(int i=0;i<n;i++)
       {
map.put(nums[i],map.getOrDefault(nums[i],0)+1);

       }
    for(int key:map.keySet())
    {
        max.add(key);
        if(max.size()>k)
        {
            max.poll();
        }
    }
    int []arr=new int[k];
    for(int i=0;i<k;i++)
    {
        arr[i]=max.poll();
    }
       
return arr;
   
}

}