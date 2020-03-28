import java.util.LinkedList;
import java.util.List;

public class SerializeDeserializeBT {
    public String rserialize(TreeNode root, String str){
        if (root == null) {
            str += "null,";
        }
        else{
            str += str.valueOf(root.val) + ",";
            str = rserialize(root.left, str);
            str = rserialize(root.right, str);
        }
        return str;
    }

    public String serialize(TreeNode root){
        return rserialize(root, "");
    }

    public TreeNode deserialize(String str){
        String[] strArray = str.split(",");
        List<String> list = new LinkedList<>();
        return rdeserialize(list);
    }

    public TreeNode rdeserialize(List<String> list){
        if (list.get(0).equals("null")){
            list.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = rdeserialize(list);
        root.right = rdeserialize(list);

        return root;
    }
}
