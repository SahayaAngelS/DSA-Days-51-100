/*You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.*/
import java.util.*;
class repeatednumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=repeatedNTimes(arr);
        System.out.println(res);
    }
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int dup=0;
        int n=nums.length;
        for(int num:nums)
        { if(!set.contains(num))
        {
            set.add(num);
        }
else
{
   dup=num;
}
        }
        return dup;
    
    }
}