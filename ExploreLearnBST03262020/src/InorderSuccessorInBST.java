public class InorderSuccessorInBST {
    //That node can either be p's parent or the smallest node in p' right branch.
    public TreeNode successor(TreeNode root, TreeNode p){
        if (root == null) return null;

        if (root.val <= p.val){
            return successor(root.right, p);
        } else {
            TreeNode left = successor(root.left, p);
            return (left != null) ? left : root;
        }
    }
}
