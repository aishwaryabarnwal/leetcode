class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxV = horizontalCuts[0], maxH = verticalCuts[0];   
        int m = horizontalCuts.length, n = verticalCuts.length;
        for(int i=1;i<n;i++)
        {
            maxH = Math.max(maxH, verticalCuts[i] - verticalCuts[i-1]);
        }
        maxH = Math.max(maxH, w - verticalCuts[n - 1]);
        for(int i=1;i<m;i++)
        {
            maxV = Math.max(maxV, horizontalCuts[i] - horizontalCuts[i-1]);
        }
        maxV = Math.max(maxV, h - horizontalCuts[m - 1]);
        return (int) ((long) maxH * maxV % 1000000007) ;
    }
}