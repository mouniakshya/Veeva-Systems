class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=1;
        for(int key:map.keySet()){
        if(map.get(key)>max)
        max=map.get(key);
        }
        int sum=0;
        for(int key:map.keySet()){
            if(map.get(key)==max)
            sum=sum+map.get(key);
        }
        return sum;
    }
}