public class CountUnivalueSubtrees {
    int count = 0;

    public boolean isUnivalue(TreeNode node){
        if (node.left == null && node.right == null) {
            count++;
            return true;
        }

        boolean isUnivalue = true;

        if (node.left != null)
            isUnivalue = isUnivalue && node.left.val == node.val && isUnivalue(node.left);

        if (node.right != null)
            isUnivalue = isUnivalue && node.right.val == node.val && isUnivalue(node.right);

        if (!isUnivalue) return false;

        count++;
        return true;
    }

    public int countUnivalue(TreeNode root){
        if (root == null) return 0;
        isUnivalue(root);
        return count;
    }
}
