class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max1=(nums[n-1]-1)*(nums[n-2]-1);
        int max2=(nums[0]-1)*(nums[1]-1);
        if(max1>=max2)
        return max1;
        else
        return max2;
    }
}