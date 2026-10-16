class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int a=pq.poll();
            pq.add((int)Math.sqrt(a));
        }
        long sum=0;
        for(int i=0;i<gifts.length;i++){
        sum=sum+pq.poll();
        }
     return sum;
    }
}