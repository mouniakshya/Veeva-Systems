class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=String.valueOf(num);
        for(int i=0;i<=s.length()-k;i++){
            String st=s.substring(i,i+k);
            int a=Integer.parseInt(st);
            
            if(a!=0 && (num%a)==0 )
            count++;
        }
        return count;

    }
}