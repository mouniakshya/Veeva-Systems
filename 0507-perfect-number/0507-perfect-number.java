class Solution {
    public boolean checkPerfectNumber(int num) {
        int a=num;
        int sum=0;
        
        for(int i=1;i<=a/2;i++){
            if(num%i==0)
            {
            sum=sum+i;
           
            }
        }
        
        if(sum==a)
        return true;
        else
        return false;
    }
}