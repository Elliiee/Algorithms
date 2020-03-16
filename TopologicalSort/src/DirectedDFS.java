import edu.princeton.cs.algs4.In;

public class DirectedDFS {
    private boolean[] marked; // is v reachable?

    public DirectedDFS(Digraph G, int s){
        Digraph g = G;
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    public DirectedDFS(Digraph G, Iterable<Integer> sources){
        marked = new boolean[G.V()];
        for (int s : sources)
            if (!marked[s])
                dfs(G, s);
    }

    private void dfs(Digraph G, int v){
        marked[v] = true;
        for (int w : G.adj(v))
            if (!marked[w])
                dfs(G, w);
    }

    public boolean marked(int v){
        return marked[v];
    }


}
