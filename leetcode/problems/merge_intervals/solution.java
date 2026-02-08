class Solution {
    public int[][] merge(int[][] intervals) {
        
       if(intervals.length <= 1)
            return intervals;
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int []> result = new ArrayList<>();
        int[] curr = intervals[0];

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0] <= curr[1])
                curr[1] = Math.max(curr[1], intervals[i][1]);
            else
            {
                result.add(curr);
                curr = intervals[i];
            }
        }
        result.add(curr);
        return result.toArray(new int[result.size()][]);

    }
}