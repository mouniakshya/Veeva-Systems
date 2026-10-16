class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int f = 0;
            int a = i;

            while (i != 0) {
                int z = i % 10;

                if (z == 0 || (a % z) != 0) {
                    f = 1;
                    break;
                }

                i = i / 10;
            }

            if (f == 0)
                list.add(a);

            i = a;   
        }

        return list;
    }
}