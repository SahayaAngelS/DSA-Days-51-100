import java.util.*;
public class groupanagram {
    static List<List<String>> anagram(String[]arr)
    {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String word:arr){
            char[]ch=word.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[]arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine().trim();
        }
        List<List<String>> result = anagram(arr);


System.out.println(result);
    }
}
