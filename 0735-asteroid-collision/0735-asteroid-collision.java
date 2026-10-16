
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int x : arr) {
            while (!st.isEmpty() && st.peek() > 0 && x < 0) {
                if (st.peek() < -x) {
                    st.pop();
                } else if (st.peek() == -x) {
                    st.pop();
                    x = 0;
                    break;
                } else {
                    x = 0;
                    break;
                }
            }

            if (x != 0) {
                st.push(x);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}
