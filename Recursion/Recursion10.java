public class Recursion10 {
    public long countFriendsPairings(int n) {
        if(n==1||n==2){
            return n;
        }
        return countFriendsPairings(n-1) + countFriendsPairings(n-2)*(n-1);
    }
    public static void main(String[] args) {
        Recursion10 sol = new Recursion10();
        int n = 4; // Example input
        long result = sol.countFriendsPairings(n);
        System.out.println("Number of ways to pair " + n + " friends: " + result); // Output: 10
    }
}
