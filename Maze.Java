import java.io.*;
import java.util.*;
import java.util.HashMap;

class Maze{
    private int V; // No. of vertices
	private LinkedList<Integer> adj[]; 
    Maze(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<Integer>();
	}
    // Function to add an edge into the graph
	void addEdge(int v, int w) { adj[v].add(w); }
    public static void main(String args[])
	{
		Maze g = new Maze(5);

		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(2,3);
		g.addEdge(1,3);
		g.addEdge(3,4);
		g.addEdge(4,1);
    }


}
