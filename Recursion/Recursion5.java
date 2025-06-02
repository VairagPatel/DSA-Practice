public class Recursion5 {
    public static int fib(int n ){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String Args[]){
        int n = 5;
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}
// Output: Fibonacci of 5 is: 5
// This code defines a recursive method to calculate the nth Fibonacci number.
