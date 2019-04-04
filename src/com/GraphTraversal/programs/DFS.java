package com.GraphTraversal.programs;

import java.util.Iterator;
import java.util.LinkedList;

class DFS {
	private int numVertices;
	private LinkedList<Integer> adj[];
	private boolean visited[];

	DFS(int vertices) {
		numVertices = vertices;
		adj = new LinkedList[vertices];
		visited = new boolean[vertices];

		for (int i = 0; i < vertices; i++)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
	}


	void DFSresult(int v) {
		visited[v] = true;
		System.out.print(v + " ");

		Iterator<Integer> ite = adj[v].listIterator();
		while (ite.hasNext()) {
			int adj = ite.next();
			if (!visited[adj])
				DFSresult(adj);
		}
	}

	public static void main(String args[]) {
		DFS g = new DFS(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal");

		g.DFSresult(2);
	}
}