public class Recursion9 {
    static int numberOfWays(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return numberOfWays(n-1) + numberOfWays(n-2);
    }
    public static void main(String[] args) {
        int n = 15; // Example input
        int result = numberOfWays(n);
        System.out.println("Number of ways to reach the " + n + "th step: " + result);
    }
}
