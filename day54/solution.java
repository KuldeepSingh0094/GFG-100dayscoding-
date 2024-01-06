package day54;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    // Function to detect cycle in an undirected graph.
    
    class Pair
    {
        int node;
        int parent;
        Pair(int x,int y)
        {
            this.node=x;
            this.parent=y;
        }
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

                Set<Integer> vis=new HashSet<>();
        for(int i=0;i<V;i++)
        {
            if(!vis.contains(i))
            {
                         if(bfs(vis,i,adj))
                         {
                             return true;
                         }
            }
        }
        return false;
    }
    
    public boolean bfs(Set<Integer> vis,int node,ArrayList<ArrayList<Integer>> adj)
    {
        //new queue for every isolated graphs
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(node,-1));
                    vis.add(node);

        while(!q.isEmpty())
        {
            int node1=q.peek().node;
            int par=q.peek().parent;
            q.remove();

         for(int i:adj.get(node1))
        {
            if(!vis.contains(i))
            {
                            vis.add(i);
                q.add(new Pair(i,node1));
            }
            
            else if(par!=i)
            {
                return true;
            }
        }
        }
return false;
        
        
        
        
    }
}