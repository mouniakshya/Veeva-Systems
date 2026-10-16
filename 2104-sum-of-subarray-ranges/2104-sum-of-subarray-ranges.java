class Solution {
    public long subArrayRanges(int[] nums) {
        long r = 0;
        for (int i = 0; i < nums.length; i++) {
            int cmax = nums[i];
            int cmin = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                cmax = Math.max(cmax, nums[j]);
                cmin = Math.min(cmin, nums[j]);
                r += (cmax - cmin);
            }
        }
        return r;
    }
}