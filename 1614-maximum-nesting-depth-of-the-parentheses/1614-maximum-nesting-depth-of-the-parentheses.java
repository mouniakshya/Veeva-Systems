class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='(')
            st.push('(');
            else if(c==')')
            st.pop();
            max=Math.max(st.size(),max);
        }
     return max;
    }
}