public class P19FibonacciNumber {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int twoBefore = 0;
        int oneBefore = 1;
        int currFibNum = 0;

        for (int i = 1; i < n; i++) {
            currFibNum = twoBefore + oneBefore;
            twoBefore = oneBefore;
            oneBefore = currFibNum;
        }

        return currFibNum;

        // Non-dynamic approach
        // if (n == 0) {
        //     return 0;
        // }

        // if (n == 1) {
        //     return 1;
        // }

        // return fib(n - 1) + fib(n - 2);
    }
}