public class Recursion7 {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[] { first, last };
    }

    private int findBound(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1; // Search left
                } else {
                    low = mid + 1;  // Search right
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Recursion7 sol = new Recursion7(); // ← changed from Solution to Seven

        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int[] result1 = sol.searchRange(nums1, 8);
        System.out.println("Result: [" + result1[0] + ", " + result1[1] + "]"); // [3, 4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int[] result2 = sol.searchRange(nums2, 6);
        System.out.println("Result: [" + result2[0] + ", " + result2[1] + "]"); // [-1, -1]

        int[] nums3 = {};
        int[] result3 = sol.searchRange(nums3, 0);
        System.out.println("Result: [" + result3[0] + ", " + result3[1] + "]"); // [-1, -1]
    }
}
// This code defines a class `Seven` with a method `searchRange` that finds the starting and ending positions of a target value in a sorted array. It uses a helper method `findBound` to perform a binary search for both the first and last occurrences of the target. The main method demonstrates how to use the `searchRange` method with different test cases.
// The `findBound` method takes an additional boolean parameter `findFirst` to determine whether to search for the first or last occurrence of the target value. It returns the index of the found position or -1 if the target is not present in the array.