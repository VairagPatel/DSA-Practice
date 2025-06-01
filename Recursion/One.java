public class One {
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
}
// Output: 1 2 3 4 5 6 7 8 9 10
// This code defines a recursive method to print numbers from 1 to n.   