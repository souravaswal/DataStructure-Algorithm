/**
This is implementation of Graph using Array of LinkedList 
& implementation
**/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class myGraph 
{
    private LinkedList<Integer> adj[];
    
    // Here, we are initializing Adjacency Array with a LinkedList
    @SuppressWarnings("unchecked")
    public myGraph(int v)
    {
        adj = new LinkedList[v];
        for(int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<Integer>();
        }
    }
    
    // Here we are filling adjacency array with LinkedList
    public void addEdge(int source, int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);
    }
    
    
    //Printing Graph values here
    public void printGraph(int edges)
    {
        for(int k=0; k<edges; k++)
        {
            System.out.println(adj[k]);
        }
    }
    
    // Search using BFS search
    public int bfs(int source, int destination)
    {
        boolean[] visited = new boolean[adj.length];
        int[] parent = new int[adj.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(source);
        parent[source] = -1;
        visited[source] = true;
        
        // Here, we insert each neighbor of an element into queue & check if it is visited or not.
        while(!queue.isEmpty())
        {
            int current = queue.poll();
            if(source == destination) break;
            for(int neighbor : adj[current])
            {
                if(!visited[neighbor])
                {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    parent[neighbor] = current;
                }
            }
        }
        
        int distance = 0;
        int current = destination;
        
        // Here, we traversed the parent array & reaches to source from destination.
        while(parent[current] != -1)
        {
            System.out.println(current+" --> " );
            current = parent[current];
            distance++;
        }
        return distance;
    }
    
    // Utility method that will make a recursive call and checks if path is possible to the destination or not
    public boolean dfsUtils(int source, int destination, boolean[] vis)
    {
        if(source == destination)
        {
            return true;
        }
        for (int neighbor : adj[source]) {
            if(!vis[neighbor])
            {
                vis[neighbor] = true;
                boolean isConnected = dfsUtils(neighbor, destination, vis);
                if(isConnected) return true;
            }
        }
        return false;
    }
    
    // Method to call util method
    public boolean dfs(int source, int destination)
    {
        boolean[] vis = new boolean[adj.length];
        vis[source] = true;
        return dfsUtils(source, destination, vis);
    }
    
    public boolean dfsStack(int source, int destination)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(source);
        boolean visited[] = new boolean[adj.length];
        visited[source] = true;
        while(!stack.isEmpty())
        {
            if(source ==destination) return true;
            int current = stack.pop();
            for(int neighbor : adj[current])
            {
                if(!visited[neighbor])
                {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int vertices = input.nextInt();
        int edges = input.nextInt();
        
        myGraph graph = new myGraph(vertices);
        System.out.println("Enter "+edges+" edges");
        for(int i=0; i<edges; i++)
        {
            int source = input.nextInt();
            int destination = input.nextInt();

            graph.addEdge(source, destination);
        }
        input.close();
        graph.printGraph(edges);
        graph.bfs(0, 4);
        graph.dfsStack(0, 4);
        System.out.println(graph.dfs(0, 3));
    }

}

