class Solution {
    public String longestPalindrome(String s) {

        for (int len = s.length(); len >= 1; len--) {

            for (int i = 0; i + len <= s.length(); i++) {

                String sub = s.substring(i, i + len);

                if (isPalindrome(sub))
                    return sub;
            }
        }

        return "";
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}