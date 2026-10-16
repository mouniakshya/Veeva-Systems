class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int curr=0;
        for(int i:nums){
            curr=Math.max(curr,0);
            curr=curr+i;
            sum=Math.max(curr,sum);
        }
        return sum;
    }
}