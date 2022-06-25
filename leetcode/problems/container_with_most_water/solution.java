class Solution {
    public int maxArea(int[] height) {
        
        int res = Integer.MIN_VALUE;
        int begin = 0;
        int end = height.length - 1;
        while(begin < end)
        {
            int h = Math.min(height[begin], height[end]);
            int width = end - begin;
            res = Math.max(res, width * h);
            if(height[begin] < height[end])
            {
                begin++;
            }
            else
            {
                end--;
            }
        }
        return res;
    }
}