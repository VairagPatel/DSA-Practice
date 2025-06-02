public class Recursion4 {
    public static int calsum(int n){
        if(n==0){
            return 0;
        }
        return n + calsum(n - 1);
    }
    public static void main(String Args[]){
        int n = 5;
        int result = calsum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
// Output: Sum of first 5 natural numbers is: 15
// This code defines a recursive method to calculate the sum of the first n natural numbers.