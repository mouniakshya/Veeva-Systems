class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int j=0;

        for(int i=0;i<n && j<m;i++){
            int a = str1.charAt(i);
            int b = str2.charAt(j);
            if(a==b || a+1==b || a-25==b) j++;
        }
    return j==m;
    }
}