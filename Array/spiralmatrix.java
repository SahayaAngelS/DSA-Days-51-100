import java.util.*;

public class spiralmatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0, r = n - 1;
        int t = 0, b = m - 1;

        while (l <= r && t <= b) {

            // Top row
            for (int i = l; i <= r; i++) {
                ans.add(matrix[t][i]);
            }
            t++;

            // Right column
            for (int i = t; i <= b; i++) {
                ans.add(matrix[i][r]);
            }
            r--;

            // Bottom row
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    ans.add(matrix[b][i]);
                }
                b--;
            }

            // Left column
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Input matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        spiralmatrix obj = new spiralmatrix();
        List<Integer> result = obj.spiralOrder(matrix);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}