class Solution {
    public String capitalizeTitle(String s) {
        String str = "";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() <= 2) {
                str = str + word.toLowerCase();
            } else {
                str = str + Character.toUpperCase(word.charAt(0));

                for (int j = 1; j < word.length(); j++) {
                    str = str + Character.toLowerCase(word.charAt(j));
                }
            }

            if (i < words.length - 1) {
                str = str + " ";
            }
        }

        return str;
    }
}