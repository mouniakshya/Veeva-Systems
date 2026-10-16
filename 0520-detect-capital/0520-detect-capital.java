class Solution {
    public boolean detectCapitalUse(String s) {
        int d=0;
        char c=s.charAt(0);
        if(Character.isUpperCase(c))
        d=1;
        
        int n=s.length();
        int k=0;
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(Character.isUpperCase(ch))
            k++;
        }
        if(k==0||(k==1 &&d==1)||k==n)
        return true;
        else
        return false;
    }
}