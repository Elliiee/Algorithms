import edu.princeton.cs.algs4.*;

public class DirectedDFS {
    private boolean[] marked;

    public DirectedDFS(Graph G, int s){
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    public DirectedDFS(Graph G, Iterable<Integer> sources){
        marked = new boolean[G.V()];
        for (int s : sources){
            if (!marked[s])
                dfs(G, s);
        }
    }

    private void dfs(Graph G, int v){
        marked[v] = true;
        for (int w : G.adj(v)){
            if (!marked[w])
                dfs(G, w);
        }
    }

    public boolean marked(int v){
        return marked[v];
    }

}