package dfs;

public class floodFill {

    public int[][] FloodFill(int[][] image, int sr, int sc, int color) {
        int ori=image[sr][sc];
        if(ori==color) return image;
        dfs(image,sr,sc,color,ori);
        return image;
    }
    private void dfs(int[][] image, int r, int c, int color,int ori) {
        int m=image.length;
        int n=image[0].length;
        if(r<0||c<0||r>=m||c>=n||image[r][c]!=ori){
            return;
        }
        image[r][c]=color;
        dfs(image,r-1,c,color,ori);
        dfs(image,r+1,c,color,ori);
        dfs(image,r,c-1,color,ori);
        dfs(image,r,c+1,color,ori);
    }
}

