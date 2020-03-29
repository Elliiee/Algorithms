public class TargetSum {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target){
        calculate(nums, 0, 0, target);
        return count;
    }

    public void calculate(int[] nums, int i, int sum, int s){
        if (i == nums.length){
            if (sum == s){
                count++;
            }
            else {
                calculate(nums, i + 1, sum + nums[i], s);
                calculate(nums, i + 1, sum - nums[i], s);
            }
        }
    }
}
