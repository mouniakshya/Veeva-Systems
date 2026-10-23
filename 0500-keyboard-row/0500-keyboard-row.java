import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            String s = word.toLowerCase();
            int r1 = 0, r2 = 0, r3 = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (row1.contains(String.valueOf(ch))) r1++;
                else if (row2.contains(String.valueOf(ch))) r2++;
                else if (row3.contains(String.valueOf(ch))) r3++;
            }

            if (r1 == s.length() || r2 == s.length() || r3 == s.length()) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}