import java.util.ArrayList;
import java.util.List;

public class BTPreorder {
    List<Integer> list = new ArrayList<>();

    public List<Integer> recursion(TreeNode root){
        if (root == null) return list;

        list.add(root.val);
        recursion(root.left);
        recursion(root.right);

        return list;
    }


}
