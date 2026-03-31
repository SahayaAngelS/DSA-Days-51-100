package hashing;

import java.util.HashMap;
import java.util.Map;

public class findTheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
         for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
        }

        for(Map.Entry<Character,Integer>e :map.entrySet())
        { if(e.getValue()>0)
        {
            return e.getKey();
        }

        }
        return ' ';
    }
}
