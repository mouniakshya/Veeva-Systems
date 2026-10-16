class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        s = s+s;
        if (goal.length()!=n)
        return false;

          
            if(s.contains(goal))
            return true;
            else 
            return false;
        
        
    }
}