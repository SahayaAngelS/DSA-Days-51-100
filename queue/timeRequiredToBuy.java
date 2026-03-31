import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
      Queue<Integer>q=new LinkedList<>();
      int time=0;
      for(int i=0;i<tickets.length;i++)
      {
        q.add(i);
      } 
      while(!q.isEmpty())
      {
        int val=q.remove();
        tickets[val]--;
        time++;
        if(tickets[val]>0)
        {
            q.add(val);
        }
        if(val==k && tickets[val]==0)
        {
            return time;
        }

      }
      return -1;
    }
}