import java.util.ArrayList;
import java.util.List;

public class BTInorder {
    List<Integer> list = new ArrayList<>();

    public List<Integer> recursion(TreeNode root){
        if (root == null) return list;


        recursion(root.left);
        list.add(root.val);
        recursion(root.right);

        return list;
    }
}
