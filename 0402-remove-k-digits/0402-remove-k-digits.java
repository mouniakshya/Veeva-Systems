import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();

        for (char c : num.toCharArray()) {
            while (k > 0 && !s.isEmpty() && s.peek() > c) {
                s.pop();
                k--;
            }
            s.push(c);
        }

        while (k > 0) {
            s.pop();
            k--;
        }

        String ans = "";
        for (char c : s)
            ans += c;

        ans = ans.replaceFirst("^0+", "");

        return ans.isEmpty() ? "0" : ans;
    }
}