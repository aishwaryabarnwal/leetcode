class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] row : grid)
        {
            int l = 0, h = row.length - 1;
            while(l <= h)
            {
                int mid = l + (h-l)/2;
                if(row[mid] < 0)
                { 
                    count += h - mid + 1;
                    h = mid -1;
                }
                else
                    l = mid + 1;
            }
        }
        // for(int[] row : grid)
        // {
        //     int h = row.length;
        //     int i = 0;
        //     for(int col : row)
        //     {
        //         if(col < 0)
        //         {
        //             count += h - i;
        //             break;
        //         }
        //         else 
        //             i++;
        //     }
        // }
        return count;
    }
}