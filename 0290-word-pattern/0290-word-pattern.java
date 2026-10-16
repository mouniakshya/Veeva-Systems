class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            if (!Objects.equals(
                    map1.put(pattern.charAt(i), i),
                    map2.put(words[i], i))) {
                return false;
            }
        }

        return true;
    }
}