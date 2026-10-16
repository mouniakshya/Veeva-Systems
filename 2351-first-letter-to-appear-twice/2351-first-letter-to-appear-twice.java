class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
    HashSet<Character>set=new HashSet<>();
        for (char c : s.toCharArray()) {
            if(set.contains(c))
            return c;
            else
            set.add(c);
        }

        return '\0';
    }
}