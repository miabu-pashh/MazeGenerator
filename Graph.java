import java.io.*;
import java.util.*;
import java.util.HashMap;
public class Graph{

    private int V; // No. of vertices
	private LinkedList<Integer> adj[]; 
    Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<Integer>();
	}
    // Function to add an edge into the graph

	void addEdge(int v, int w) { adj[v].add(w); }
	// The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
 
        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }
 
	void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
 
        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
	
    public static void main(String args[])
	{
		Graph g = new Graph(5);

		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(2,3);
		g.addEdge(1,3);
		g.addEdge(3,4);
		g.addEdge(4,1);

		// for depth first Search
		// Graph g = new Graph(4);
 
        // g.addEdge(0, 1);
        // g.addEdge(0, 2);
        // g.addEdge(1, 2);
        // g.addEdge(2, 0);
        // g.addEdge(2, 3);
        // g.addEdge(3, 3);

		System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
 
        // Function call
        g.DFS(2);
    }

}