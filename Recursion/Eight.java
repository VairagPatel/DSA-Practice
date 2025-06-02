class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        long N = n; // Avoid overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = fastPow(x, n / 2);
        double result = half * half;

        if (n % 2 != 0) {
            result *= x;
        }

        return result;
    }
}

public class Eight {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double x = 2.0;
        int n = -3;
        double result = solution.myPow(x, n);
        System.out.println("Result: " + result); // Output: 0.125
    }
}
// This code defines a class `Solution` with a method `myPow` that calculates the power of a number using recursion.
// The method handles both positive and negative exponents. It uses a helper method `fastPow` to compute the power efficiently by reducing the problem size in each recursive call. The main method demonstrates how to use the `myPow` method with an example.