class Solution {
    public boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            // Check letter or digit
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            // Check vowel
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U') {

                vowel = true;
            }

            // Check consonant
            else if (Character.isLetter(c)) {
                consonant = true;
            }
        }

         if(vowel && consonant)
         return true;
         else
         return false;
    }
}