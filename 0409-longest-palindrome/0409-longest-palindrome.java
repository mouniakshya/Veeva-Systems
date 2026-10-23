class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum=0;
        int iu=0;
        for (char key : map.keySet()) {
        int i = map.get(key);
            if(i%2==0){
             sum=sum+i;
            }
           else if(i%2!=0 && i>2)
            {
                sum=sum+i-1;
                iu=1;
            }
           else if(i==1)
           iu=1;
           
        }
        if(iu==1)
        sum=sum+iu;
        return sum;
    }
}