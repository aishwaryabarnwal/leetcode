class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[] > q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j] == 2)
                    q.offer(new int[]{i, j, 0}); // {row, col, time}
                if(grid[i][j] == 1)
                    fresh++;
            }
        }
         int time = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
         while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int t = curr[2];

            time = Math.max(time, t);

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;     // rot it
                    fresh--;
                    q.offer(new int[]{nr, nc, t + 1});
                }
            }
        }

        // Step 3: Check if fresh oranges remain
        if (fresh > 0)
            return -1;

        return time;
    }
}