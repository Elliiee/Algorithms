public class ValidateBST {
    /*
    Compare the node value with the upper and lower limits, not with the children.
     */

    public boolean isValidBST(TreeNode root){
        return isValidBST(root, null, null);
    }
    private boolean isValidBST(TreeNode node, Integer lower, Integer upper){
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!isValidBST(node.right, val, upper)) return false;
        if (!isValidBST(node.left, lower, val)) return false;

        return true;
    }
}
