class Solution {
    public int numDifferentIntegers(String word) {

        String[] arr = word.split("\\D+");

        HashSet<String> set = new HashSet<>();

        for (String s : arr) {
            if (!s.isEmpty()) {
                s = s.replaceFirst("^0+", "");

                if (s.isEmpty()) {
                    s = "0";
                }

                set.add(s);
            }
        }

        return set.size();
    }
}