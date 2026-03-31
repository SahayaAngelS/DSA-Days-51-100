package greedyalgo;
import java.util.*;
public class minicoin {
    static int count(int amount,int[]coins)
    {  ArrayList<Integer>sol=new ArrayList<>();
        int n=coins.length;
        for(int i=n-1;i>=0;i--)
        {
            while(coins[i]<=amount)
            {
               sol.add(coins[i]);
               amount-=coins[i];
            }
        }
        return sol.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int amt=sc.nextInt();
        int res=count(amt,coins);
        System.out.println(res);
    }
    
}
