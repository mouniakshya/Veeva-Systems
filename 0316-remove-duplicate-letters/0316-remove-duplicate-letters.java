import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!st.contains(c)) {
                while (!st.isEmpty() && st.peek() > c && s.indexOf(st.peek(), i + 1) != -1) {
                    st.pop();
                }
                st.push(c);
            }
        }

        String res = "";
        for (char c : st) {
            res += c;
        }

        return res;
    }
}