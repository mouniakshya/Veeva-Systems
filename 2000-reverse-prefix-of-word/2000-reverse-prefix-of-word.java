class Solution {
    public String reversePrefix(String s, char ch) {
        int a = s.indexOf(ch);

        if (a == -1) {
            return s;
        }

        char[] arr = s.toCharArray();

        int i = 0;
        int j = a;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
}