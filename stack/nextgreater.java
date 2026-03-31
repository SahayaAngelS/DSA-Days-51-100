package stack;
import java.util.*;
public class nextgreater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = great(arr);

        System.out.println("Next Greater Elements:");
        for(int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] great(int[] arr) {
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[n];

        for(int i = n - 1; i >= 0; i--) {
            while(!stk.isEmpty() && stk.peek() < arr[i]) {
                stk.pop();
            }

            if(stk.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stk.peek();
            }

            stk.push(arr[i]);
        }

        return res;
    }
}