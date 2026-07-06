/*class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->
            a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );

        int count = 0;
        int maxEnd = 0;

        for (int[] interval : intervals) {
            if (interval[1] > maxEnd) {
                count++;
                maxEnd = interval[1];
            }
        }

        return count;
    }
}*/
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
    //current = intervals[i] = [a, b]
    // other = intervals[j] = [c, d]
        int n = intervals.length;
        int remaining = n;

        for(int i=0;i<n;i++){
            boolean covered = false;
            int a  = intervals[i][0];
            int b = intervals[i][1];

            for(int j=0;j<n;j++){
                if(i==j) continue;

                int c = intervals[j][0];
                int d = intervals[j][1];

                if(c<=a && b<=d){
                    covered = true;
                    break;
                }
            }
            if (covered){
                remaining--;
            }
        }
        return remaining;
    }
}