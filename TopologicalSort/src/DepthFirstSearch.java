public class DepthFirstSearch {
    private boolean[] marked; // Is v connected to s?
    private int count;  // How many vertices are connected to s?

    // Find the vertices connected to a source vertex s.
    // Constructor
    public DepthFirstSearch(Graph G, int s){
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    private void dfs(Graph G, int v){
        marked[v] = true;
        count++;
        for (int w : G.adj(v)){
            if (!marked[w])
                dfs(G, w);
        }
    }

    public boolean marked(int w) { return marked[w]; }
    public int count() { return count; }
}
/*
Find the vertices connected to a source vertex s.
 */
