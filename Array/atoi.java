import java.util.*;
public class atoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int res=solution(str);
        System.out.println(res);
        sc.close();
    }
    private static int solution(String str)
    {
        int i=0;
        int n=str.length();
        long num=0;
        while(i<n &&str.charAt(i)==' ')
        {
            i++;
        }
        if(i==n)return 0;
        int sign=1;
        if(str.charAt(i)=='-'||str.charAt(i)=='+')
        {
            sign=(str.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n && Character.isDigit(str.charAt(i)))
        {

            num=num*10+(str.charAt(i)-'0');
            if(sign*num>Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(sign*num<Integer.MIN_VALUE)return Integer.MIN_VALUE;
            
        }
        return (int)(num*sign);
    }


    
}
