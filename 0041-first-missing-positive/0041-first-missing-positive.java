import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int p = 1;
        // Efficiently find the first integer not present in the set
        while (set.contains(p)) {
            p++;
        }
        
        return p;
    }
}
