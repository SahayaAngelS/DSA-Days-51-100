import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result=new ArrayList<>();
      for(int i=1;i<=numRows;i++)
      { List<Integer>ans=new ArrayList<>();
      long val=1;
        ans.add((int)val);
        for(int j=1;j<i;j++)
        {
           val=val*(i-j);
           val=val/j;
           ans.add((int)val);
        }
        result.add(ans);
    }
    return result;
    }
}