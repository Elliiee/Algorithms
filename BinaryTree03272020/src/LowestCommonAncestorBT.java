

public class LowestCommonAncestorBT {
    private TreeNode ans;

    private boolean recurseTree(TreeNode current, TreeNode p, TreeNode q){
        if (current == null) return false; // reach the end

        int left = recurseTree(current.left, p, q) ? 1 : 0;
        int right = recurseTree(current.right, p, q) ? 1 : 0;

        int mid = (current == p || current == q) ? 1 : 0;

        if (mid + left + right >= 2)
            ans = current;

        return mid + left + right > 0;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        recurseTree(root, p, q);
        return ans;
    }
}
