class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
       
        for(int num:nums){
         map.put(num,map.getOrDefault(num,0)+1);
        
        }
        int ans=0;
        for(int key:map.keySet()){
           int b= map.get(key);
            if(b>1)
            ans=ans+(b*(b-1)/2);
            
        }
        return ans; 
    }
}
