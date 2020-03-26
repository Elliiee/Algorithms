import java.util.Stack;

public class BSTIteratorDesign {
    private Stack<TreeNode> stack;

    public BSTIteratorDesign(TreeNode root){
        this.stack = new Stack<TreeNode>();
        this.leftMostInorder(root);
    }

    private void leftMostInorder(TreeNode root){
        while (root != null){
            this.stack.push(root);
            root = root.left;
        }
    }

    // return the next smallest number
    public int next(){
        TreeNode topMostNode = this.stack.pop();

        if (topMostNode.right != null){
            this.leftMostInorder(topMostNode.right);
        }

        return topMostNode.val;
    }

    // return whether there is the next smallest number
    public boolean hasNext(){
        return this.stack.size() > 0;
    }
}
