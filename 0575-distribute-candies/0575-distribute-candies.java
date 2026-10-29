class Solution {
    public int distributeCandies(int[] c) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<c.length;i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
        int sum=0;
        int a=0;
        int n=c.length;
        for(int key:map.keySet()){
            int i=map.get(key);
            if(sum<n/2)
            sum++;
        }
        
        return sum;
    }
}