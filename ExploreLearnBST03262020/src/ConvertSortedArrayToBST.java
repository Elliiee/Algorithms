public class ConvertSortedArrayToBST {
    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums){
        this.nums = nums;
        return sortedArrayToBST(0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int left, int right){
        if (left > right) return null;

        int p = (left + right) / 2; // it will always be the left middle one

        TreeNode root = new TreeNode(nums[p]);
        root.left = sortedArrayToBST(left, p-1);
        root.right = sortedArrayToBST(p + 1, right);

        return root;
    }
}
