import edu.princeton.cs.algs4.*;
public class Topological {
    private Iterable<Integer> order;

    public Topological(Digraph G){
        DirectedCycle cyclefiner = new DirectedCycle(G);
        if (!cyclefiner.hasCycle()){
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
        }
    }

    public Iterable<Integer> order(){
        return order;
    }

    public boolean isDAG(){
        return order == null;
    }
}
