class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        if(s.length()<1)
            return true;
        int si=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(si)==t.charAt(i))
            si++;
            if(si==n)
            return true;
           
        }
        return false;
        
    }
}