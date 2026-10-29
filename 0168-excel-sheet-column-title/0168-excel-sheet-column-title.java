class Solution {
    public String convertToTitle(int c) {
        String s = "";

        while (c > 0) {
            c--;
            char ch = (char)('A' + c % 26);
            s = ch + s;
            c = c / 26;
        }

        return s;
    }
}