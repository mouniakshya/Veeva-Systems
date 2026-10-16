class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(nums[i]);

        }
        for(int i=0;i<n-1;i+=2){
            int a=pq.poll();
            int b=pq.poll();
            arr[i]=b;
            arr[i+1]=a;
        }
        return arr;
    }
}