class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr=new int[m+n];
        int k=m+n;
     for(int i=0;i<m;i++){
      arr[i]=nums1[i];

     }  
     for(int i=m;i<m+n;i++){
      arr[i]=nums2[i-m];

     }  
     Arrays.sort(arr);
     if(k%2!=0)
     {
        int t= (k)/2;
        return (double) arr[t];
     }
     else{
     int t=k/2;
     int s=arr[t];
     int u=arr[t-1];
     double y=(double)(s+u)/2;
     return y;
     }

    }
}