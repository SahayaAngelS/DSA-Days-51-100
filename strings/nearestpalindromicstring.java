package strings;

import java.util.HashSet;
import java.util.Set;

public class nearestpalindromicstring {
    class Solution {
    public String nearestPalindromic(String n) {
        int len=n.length();
        long num=Long.parseLong(n);
        Set<Long>set=new HashSet<>();
      set.add((long)Math.pow(10, len - 1) - 1);
set.add((long)Math.pow(10, len) + 1);
       long prefix=Long.parseLong(n.substring(0,(len+1)/2));
       for(long i=prefix-1;i<=prefix+1;i++)
       {
        String firsthalf=String.valueOf(i);
        StringBuilder str=new StringBuilder(firsthalf);
        if(len%2==1)
        {
            str.deleteCharAt(str.length()-1);
        }
        String full=firsthalf+str.reverse().toString();
        set.add(Long.parseLong(full));
       }
        long ans=-1;
        for(long nums:set)
        {
            if(nums==num)
            {
                continue;
            }
            if(ans==-1||Math.abs(nums-num)<Math.abs(num-ans)||Math.abs(nums-num)==Math.abs(num-ans)&& nums<ans)
            {
                ans=nums;
            }
        }
       
       
 return String.valueOf(ans);
    }
}
}
