package dfs;

import java.util.*;

public class validPath {
    
    public boolean ValidPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>g=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            g.add(new ArrayList<>());
        }
        for(int[]edge:edges)
        {
            g.get(edge[0]).add(edge[1]);
            g.get(edge[1]).add(edge[0]);
        }
        boolean[]vis=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        vis[source]=true;
        q.add(source);
        while(!q.isEmpty())
        {
            int node=q.poll();
            if(node==destination)return true;
            for(int neigh:g.get(node))
            {
                if(!vis[neigh])
                {
                    vis[neigh]=true;
                    q.add(neigh);
                }
            }
        }
        return false;

    }
}
