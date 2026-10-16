class Solution {
    public int getLucky(String s, int k) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            str = str + (s.charAt(i) - 'a' + 1);
        }

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        k--;

        while (k != 0) {
            int num = sum;
            sum = 0;

            while (num != 0) {
                int a = num % 10;
                num /= 10;
                sum += a;
            }

            k--;
        }

        return sum;
    }
}