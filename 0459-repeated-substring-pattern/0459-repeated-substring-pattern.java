class Solution {
    public boolean repeatedSubstringPattern(String str) {

        String doubled = str + str;

        String middle = doubled.substring(1, doubled.length() - 1);

        return middle.contains(str);
    }
}