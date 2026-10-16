class Solution {
    public int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);
        int[] arr = new int[2];
        for (int i = sqrt; i > 0; i--) {
            if (area % i == 0) {
                arr[1] = i;
                arr[0] = area / i;
                break;
            }
        }
        return arr;
    }
}