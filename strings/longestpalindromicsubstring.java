package strings;
import java.util.Scanner;

public class longestpalindromicsubstring {
    public static void main(String[] args) {
          Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        int n=str.length();
        int start=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
int len1=palindrome(str,i,i);
int len2=palindrome(str,i,i+1);
int maxi=Math.max(len1,len2);
if(maxi>end-start+1)
{
    start=i-(maxi-1)/2;
    end=i+maxi/2;
}
        }
System.out.println(str.substring(start,end+1));

        
     
       sc.close();
    }
    private static int palindrome(String str,int l,int r)
    {
        while(l>=0&&r<str.length() && str.charAt(l)==str.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }

    
}
