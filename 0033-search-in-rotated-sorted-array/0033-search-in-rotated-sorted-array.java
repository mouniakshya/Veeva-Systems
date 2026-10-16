
class Solution {
    public int search(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) { // Check if left side is correctly sorted

                if (nums[low] <= target && target < nums[mid]) {
                    // Left side is sorted. Check if target is inside the left side
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }

            }
            else { // Check if right side is correctly sorted

                if (nums[mid] < target && target <= nums[high]) {
                    // Right side is sorted. Check if target is inside the right side
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}