import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chr = s.toCharArray();
        int n = chr.length;
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            int count = 0;
            
            // FIX 1: Start 'j' at 'i' so the first character is included
            for (int j = i; j < n; j++) {
                
                if (set.contains(chr[j])) {
                    // Duplicate found! Stop processing this substring
                    break; 
                } else {
                    set.add(chr[j]);
                    count++;
                }
            }
            // FIX 2: Update max outside the inner loop 
            // This catches lengths even if the loop reaches the end of the string
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
