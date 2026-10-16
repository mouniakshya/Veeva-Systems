class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int count=0;
        int sum=0;
        int t=k*threshold;
        for(int i=0;i<k;i++)
        { 
            
            sum=sum +arr[i];
            
        }
        if(sum>=t)
            count++;

        for(int i=k;i<n;i++){
          sum=sum-arr[i-k];
          sum=sum+arr[i];
          if(sum>=t)
            count++;
        }
        return count;
    }
}