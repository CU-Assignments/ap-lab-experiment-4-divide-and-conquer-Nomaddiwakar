public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  

            if (nums[mid] == target) {
                return mid;  
            } else if (nums[mid] < target) {
                left = mid + 1;  
            } else {
                right = mid - 1;
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println("Output for Example 1: " + solution.search(nums1, target1));  

        // Example 2
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println("Output for Example 2: " + solution.search(nums2, target2));  
    }
}
