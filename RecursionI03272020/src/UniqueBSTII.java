
import java.util.LinkedList;
import java.util.List;

public class UniqueBSTII {
    public LinkedList<TreeNode> generateTrees(int start, int end){
        LinkedList<TreeNode> allTrees = new LinkedList<>();

        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; i++){
            LinkedList<TreeNode> leftTrees = generateTrees(start, i - 1);
            LinkedList<TreeNode> rightTrees = generateTrees(i + 1, end);

            for (TreeNode l : leftTrees){
                for (TreeNode r : rightTrees){
                    TreeNode currentTree = new TreeNode();
                    currentTree.left = l;
                    currentTree.right = r;
                    allTrees.add(currentTree);
                }
            }
        }
        return allTrees;
    }

    public List<TreeNode> generateTrees(int n){
        if (n == 0) return new LinkedList<TreeNode>();

        return generateTrees(1, n);
    }
}
/*
Given an integer n, generate all structurally unique BST's that store values 1 ... n
 */
