/*You are given a positive integer 
N. Determine whether 
N is a happy number.

A happy number is a non-negative integer that becomes 
1 after repeating the following operation a finite number of times:

Replace it with the integer obtained by taking the sum of the squares of the digits in its decimal representation.
For example, performing this operation once on 
2026 replaces it with 2*2+0*0+2*2+6*6 =4+0+4+36=44.then 4*4+4*4=36 then 3*3+2*2=13 then 1*1+3*3=1+9=10 then 1*1+0*0=1 it is a happy number
For examples of happy numbers, refer to the explanations of sample inputs and outputs.

*/
import java.util.*;
public class happynumber
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
 
    HashSet<Integer>set=new HashSet<>();
    while(num!=1 && !set.contains(num))
    {
      set.add(num);
      int sum=0;
       while(num!=0)
    {
      int digit=num%10;
      sum+=digit*digit;
      num=num/10;
    }
    num=sum;
    }
    if(num==1)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
   
  }
}