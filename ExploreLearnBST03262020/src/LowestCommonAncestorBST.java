public class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        int parentVal = root.val;

        int pVal = p.val;
        int qVal = q.val;

        if (pVal > parentVal && qVal > parentVal){ // they are both at right subtree
            return lowestCommonAncestor(root.right, p, q);
        }
        else if (pVal < parentVal && qVal <parentVal){ // they are both at left subtree
            return lowestCommonAncestor(root.left, p, q);
        }
        else { // they are at a different of the node, fount it
            return root;
        }
    }
}
