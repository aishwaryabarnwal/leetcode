class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long maxSide = 0;
        int n = bottomLeft.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                //overlap width
                int width = Math.min(topRight[i][0], topRight[j][0]) -
                            Math.max(bottomLeft[i][0], bottomLeft[j][0]);

                //overlap height
                int height = Math.min(topRight[i][1], topRight[j][1]) -
                            Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                
                int sqSide = Math.min(width, height);
                maxSide = Math.max(maxSide, sqSide);
            }
        }
        return maxSide * maxSide;
    }
}