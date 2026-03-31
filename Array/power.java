
   /*You are given an integer 
N. Compute and output the value of 
2 pow N−2N. */ import java.util.*;
public class power
{
public static void main(String[]args)
{
  Scanner sc=new Scanner (System.in);
  int n=sc.nextInt();
 double pow=Math.pow(2,n);
  int mul=n*2;
  int res=(int)pow-mul;
  System.out.println(res);
}
}
    
