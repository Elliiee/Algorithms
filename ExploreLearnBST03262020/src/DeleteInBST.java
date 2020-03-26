public class DeleteInBST {
    public int successor(TreeNode root){
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return root.val;
    }

    public int predecessor(TreeNode root){
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return root.val;
    }

    public TreeNode deleteNode(TreeNode root, int key){
        if (root == null) return null;

        if (key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else if (key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else{
            if (root.left == null && root.right == null){  // it's a leaf
                root = null;  // simply set it to null/ delete
            }
            else if (root.right != null){
                root.val = successor(root); // change the node to the successor
                root.right = deleteNode(root.right, root.val); // don't forget to delete the extra "successor"
            }
            else { // the node does not have a right child, the successor is upper somewhere but we don't want go back
                root.val = predecessor(root); // use the predecessor, much easier, no need to go back
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }
}
