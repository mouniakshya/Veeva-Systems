class Solution {
    public void sortColors(int[] nums) {
        int cnt=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            cnt++;
            if(nums[i]==1)
            cnt1++;
            if(nums[i]==2)
            cnt2++;
        }
        for(int i=0;i<cnt;i++)
        nums[i]=0;
        for(int i=cnt;i<cnt+cnt1;i++)
        nums[i]=1;
        for(int i=cnt+cnt1;i<cnt+cnt1+cnt2;i++)
        nums[i]=2;
    }
}