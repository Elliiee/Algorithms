import java.util.HashMap;

public class ConstructBTPreorderInorder {
    int preFirstIndex = 0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode helper(int inorderL, int inorderR){
        if (inorderL == inorderR) return null;

        int rootVal = preorder[preFirstIndex];
        TreeNode root = new TreeNode(rootVal);
        int index = indexMap.get(rootVal);

        preFirstIndex++;
        root.left = helper(inorderL, index);
        root.right = helper(index + 1, inorderR);


        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        int index = 0;
        for (Integer val : inorder)
            indexMap.put(val, index++);

        return helper(0, inorder.length);
    }
}
