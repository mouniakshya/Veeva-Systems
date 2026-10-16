
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int j = 0;

            // Find nums1[i] in nums2
            while (nums2[j] != nums1[i]) {
                j++;
            }

            // Search for the next greater element
            int k = j + 1;
            ans[i] = -1;

            while (k < nums2.length) {
                if (nums2[k] > nums1[i]) {
                    ans[i] = nums2[k];
                    break;
                }
                k++;
            }
        }

        return ans;
    }
}
