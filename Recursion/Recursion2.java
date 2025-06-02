public class Recursion2 {
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
}
// Output: 10 9 8 7 6 5 4 3 2 1
// This code defines a recursive method to print numbers from n down to 1.