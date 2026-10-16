class Solution {
    public double average(int[] arr) {
    Arrays.sort(arr);
    int n=arr.length;
    int min=arr[0];
    int max=arr[n-1];
    double sum =0;
    double count=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=max &&arr[i]!=min)
        {
            sum=sum+arr[i];
            count++;
        }
    }
    double avg=sum/count;
    return avg;

    }
}