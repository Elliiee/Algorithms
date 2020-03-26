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

    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(3);

        InorderSuccessorInBST successor = new InorderSuccessorInBST();
        TreeNode result = successor.successor(root, root.left);
        if (result == null)
            System.out.println("null");
        else
            System.out.println(result.val);
    }
}
