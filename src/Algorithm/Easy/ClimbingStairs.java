package Algorithm.Easy;

public class ClimbingStairs {
    public int oneStep(int now, int target, int[] memo) {
        if (now > target) {
            return 0;
        }
        if (now == target) {
            return 1;
        }
        if (memo[now] > 0) {
            return memo[now];
        }
        memo[now] = oneStep(now + 1, target, memo) + oneStep(now + 2, target, memo);
        return memo[now];

    }

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return oneStep(0, n, memo);
    }
}
