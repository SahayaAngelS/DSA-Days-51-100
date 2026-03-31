package strings;

    /*The country has two official languages: Takahashi-go and Aoki-go.

Both Takahashi-go and Aoki-go use some lowercase English letters to write words in those languages. Takahashi-go uses only the characters contained in a string 
S of length 
N, and Aoki-go uses only the characters contained in a string 
T of length 
M.

You are given 
Q words 
w 
1
​
 ,w 
2
​
 ,…,w 
Q
​
  that are in the official languages of the AtCoder country. For each word, determine which of the following applies based on the characters contained in that word:

It is confirmed to be a word in Takahashi-go
It is confirmed to be a word in Aoki-go
Neither can be determined*/import java.util.*;

public class twolanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); 
        
        String S = sc.nextLine().trim();
        String T = sc.nextLine().trim();
        
        int Q = sc.nextInt();
        sc.nextLine(); 
        
        boolean[] takahashi = new boolean[26];
        boolean[] aoki = new boolean[26];
        
        for (char c : S.toCharArray()) {
            takahashi[c - 'a'] = true;
        }
        for (char c : T.toCharArray()) {
            aoki[c - 'a'] = true;
        }
        
        for (int i = 0; i < Q; i++) {
            String w = sc.nextLine().trim();
            boolean isTakahashi = true;
            boolean isAoki = true;
            
            for (char c : w.toCharArray()) {
                if (!takahashi[c - 'a']) isTakahashi = false;
                if (!aoki[c - 'a']) isAoki = false;
            }
            
            if (isTakahashi && !isAoki) {
                System.out.println("Takahashi");
            } else if (isAoki && !isTakahashi) {
                System.out.println("Aoki");
            } else {
                System.out.println("Unknown");
            }
        }
        
        sc.close();
    }
}


