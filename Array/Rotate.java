import java.util.*;

public class Rotate
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotate(matrix);

        // Print rotated matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int m = matrix.length;

        // Step 1: Transpose
        for(int i = 0; i < m; i++) {
            for(int j = i + 1; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < m; i++) {
            int b = 0, e = m - 1;
            while(b < e) {
                int temp = matrix[i][b];
                matrix[i][b] = matrix[i][e];
                matrix[i][e] = temp;
                b++;
                e--;
            }
        }
    }
}