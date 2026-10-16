class Solution {
    public boolean checkValidString(String s) {
        int x=0;
        int y=0;
        int min=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
            min++;
            max++;
            }
            
            else if(s.charAt(i)==')')
            {
                min--;
                max--;
            }
            else if(s.charAt(i)=='*')
            {
                min=min-1;
                max=max+1;
            }
             if(min<0)
             min=0;
       if(max<0)
       return false;

        }
       

     return (min==0);
    }
}