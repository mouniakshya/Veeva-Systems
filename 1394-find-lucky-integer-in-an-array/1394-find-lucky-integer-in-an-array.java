class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
         if(!map.containsKey(arr[i]))
         map.put(arr[i],1);
         else
         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        for(int key:map.keySet()){
            if(key==map.get(key))
            {
                if(key>max)
                max=key;
            }
        }
        return max;
    }
}