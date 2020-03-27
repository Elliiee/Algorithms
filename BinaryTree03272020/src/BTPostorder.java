import java.util.ArrayList;
import java.util.List;

public class BTPostorder {
    List<Integer> list = new ArrayList<>();

    public List<Integer> recursion(TreeNode root){
        if (root == null) return list;


        recursion(root.left);
        recursion(root.right);
        list.add(root.val);

        return list;
    }
}
