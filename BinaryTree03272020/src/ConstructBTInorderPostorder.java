import java.util.HashMap;

public class ConstructBTInorderPostorder {
    int postLastIndex;
    int[] postorder;
    int[] inorder;
    HashMap<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode helper(int inorderL, int inorderR){
        if (inorderL > inorderR) return null;

        int rootVal = postorder[postLastIndex];
        TreeNode root = new TreeNode(rootVal);
        int index = indexMap.get(rootVal);

        postLastIndex--;
        root.right = helper(index + 1, inorderR);
        root.left = helper(inorderL, index - 1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder){
        this.postorder = postorder;
        this.inorder = inorder;
        postLastIndex = postorder.length - 1;

        // build the hash map for the helper method
        int index = 0;
        for (Integer val : inorder)
            indexMap.put(val, index++);

        return helper(0, inorder.length - 1);
    }
}
