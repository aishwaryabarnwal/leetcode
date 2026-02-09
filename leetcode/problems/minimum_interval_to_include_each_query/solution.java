class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {

        int n = queries.length;
        int[] result = new int[n];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] sortedQueries = new int[n][2];
        for(int i=0;i<n;i++)
        {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, (a, b) -> a[0] - b[0]); 
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int i = 0;
        for(int[] q : sortedQueries)
        {
            int query = q[0];
            int idx = q[1];

            // Add valid intervals
            while(i < intervals.length && intervals[i][0] <= query)
            {
                int size = intervals[i][1] - intervals[i][0] + 1;
                pq.offer(new int[]{size, intervals[i][1]});
                i++;
            }

            // Remove invalid intervals
            while(!pq.isEmpty() && pq.peek()[1] < query)
                pq.poll();

         result[idx] = pq.isEmpty() ? -1 : pq.peek()[0];
    }

    return result;

    }
}