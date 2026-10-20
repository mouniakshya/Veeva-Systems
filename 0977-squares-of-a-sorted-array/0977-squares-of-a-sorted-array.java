class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int l = 0, r = n - 1;

        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                arr[k] = nums[l] * nums[l];
                l++;
            } else {
                arr[k] = nums[r] * nums[r];
                r--;
            }
        }
        return arr;
    }
}