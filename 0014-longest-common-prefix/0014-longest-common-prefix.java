class Solution {
       public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
       for (; c < first.length(); c++) {
    if (first.charAt(c) != last.charAt(c)) {
        break;
    }
}
        return c == 0 ? "" : first.substring(0, c);
    }
}
