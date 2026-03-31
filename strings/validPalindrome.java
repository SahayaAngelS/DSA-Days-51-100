public class validPalindrome
{
    public boolean ValidPalindrome(String s) {
     int l=0;
     int r=s.length()-1;
     int count=0;
     while(l<r)
     {
        if(s.charAt(l)==s.charAt(r))
        {
            l++;
            r--;
        }
        else
        {
         return  same(s,l+1,r)||same(s,l,r-1);
        }
     } 
     return true;
    }
 private boolean  same(String s,int l,int r)
     {  
    while(l<r)
     {
    if(s.charAt(l)!=s.charAt(r))return false;
        l++;
        r--;
     }
     return true;
    }
}