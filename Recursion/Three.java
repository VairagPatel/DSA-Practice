package Recursion;
public class Three {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
// This code defines a recursive method to calculate the factorial of a number.
// The base case is when n is 0 or 1, returning 1. Otherwise, it multiplies n by the factorial of (n - 1).          
