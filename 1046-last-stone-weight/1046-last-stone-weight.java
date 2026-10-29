class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
       while(pq.size()>=2){
        int a=pq.poll();
        int b=pq.poll();
        int c=Math.abs(a-b);
        if(c!=0)
        pq.add(c);
       }
       if (pq.size() == 1)
            return pq.peek();
        else
            return 0;
    }
}