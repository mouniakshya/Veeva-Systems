class Solution {
    public int[] rearrangeArray(int[] arr) {
        int i=0;
        int j=1;
        int n=arr.length;
        int[] res=new int[n];
       for(int k=0;k<n;k++){
        if(arr[k]>0)
        {
            res[i]=arr[k];
            i=i+2;
        }
        else{
            res[j]=arr[k];
            j=j+2;
        }
       }
       return res;
    }
}