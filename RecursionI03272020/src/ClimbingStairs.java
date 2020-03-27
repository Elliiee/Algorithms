public class ClimbingStairs {
    public int climb_stairs(int i, int n){
        if (i > n) return 0;

        if (i == n) return 1;

        return  climb_stairs(i + 1, n) + climb_stairs(i + 2, n);

    }

    public int climbStairs(int n){
        return climb_stairs(0, n);
    }
}
