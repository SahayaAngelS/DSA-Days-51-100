package strings;
import java.util.*;
public class longeststringwithoutrep {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
       int ans= counts(str);
       System.out.println(ans);
       sc.close();
    }
    private static int counts(String str)
    { int max=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                if(!set.contains(str.charAt(j)))
                {
                    set.add(str.charAt(j));
                    max=Math.max(max,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
    
}

