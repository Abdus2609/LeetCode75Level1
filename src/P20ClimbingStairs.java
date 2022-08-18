public class P20ClimbingStairs {
    public static int climbStairs(int n) {
        // just a Fibonacci sequence one term ahead

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int twoSteps = 0;
        int oneStep = 1;
        int currNum = 0;

        for (int i = 1; i < n; i++) {
            currNum = twoSteps + oneStep;
            twoSteps = oneStep;
            oneStep = currNum;
        }

        return currNum;
    }
}
