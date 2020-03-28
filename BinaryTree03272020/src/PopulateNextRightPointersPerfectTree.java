import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointersPerfectTree {
    public TreeNode connect(TreeNode root){
        if (root == null) return root;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        while (!Q.isEmpty()){
            int size = Q.size();
            for (int i = 0; i < size; i++){
                TreeNode node = Q.poll();
                if (i < size - 1){
                    node.next = Q.peek();
                }
                if (node.left != null){
                    Q.add(node.left);
                }
                if (node.right != null){
                    Q.add(node.right);
                }
            }

        }
        return root;
    }
}
