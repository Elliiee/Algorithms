public class Node {
    Node left;
    Node right;
    int val;
    int cnt;

    public Node() {}

    public Node(int v, int c){
        left = null;
        right = null;
        this.val = v;
        this.cnt = c;
    }
}
