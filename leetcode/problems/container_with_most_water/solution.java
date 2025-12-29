class Solution {
    public int maxArea(int[] height) {
       int r = height.length-1;
       int l = 0, area = 0;
       while(l < r)
       {
            int len = Math.min(height[l], height[r]);
            area = Math.max(area, len * (r-l));
            if(height[l] < height[r])
                l++;
            else
                r--;
       }
       return area;
    }
} 