class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        

        int n = intervals.length;

        // Store: start, end, meeting number
        int count=0;

        // Sort according to ending time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int lastEnd = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start >= lastEnd) {
                count++;
                lastEnd = end;
            }
        }
        

        return n-count;
    }
}