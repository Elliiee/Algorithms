import edu.princeton.cs.algs4.Bag;

public class Graph {
    private final int V; // number of vertices
    private int E;  // number of edges;
    private Bag<Integer>[] adj; // adjacency list

    public Graph(int V){
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V]; // create an array of lists
        for (int v = 0; v < V; v++){
            adj[v] = new Bag<>(); // initialize all lists to be an empty one
        }
    }

    public Graph(In in){
        this(in.readInt()); // read V and construct this graph
        int E = in.readInt(); // read E
        for (int i = 0; i < E; i++) {
            int v = in.readInt(); // read a vertex
            int w = in.readInt(); // read another vertex
            addEdge(v, w); // add edge connecting them 
        }
    }

    public int V() { return V;}
    public int E() { return E;}

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
}
