package dfs;
import java.util.*;
public class orangesRotting {
    class pair {
        int i, j, time;

        pair(int i, int j, int time) {
            this.i = i;
            this.j = j;
            this.time = time;
        }
    }

    public int OrangesRotting(int[][] grid) {
        Queue<pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new pair(i, j, 0));
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;

        int time = 0;

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        
        while (!q.isEmpty()) {
            pair p = q.poll();
            int r = p.i;
            int c = p.j;
            int t = p.time;

            time = Math.max(time, t);

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

               
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    q.add(new pair(nr, nc, t + 1));
                    fresh--;
                }
            }
        }

        if (fresh > 0) return -1;

        return time;
    }
}

