class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int s = 0, start = 0, end = 0, max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max_ending_here += nums[i];
            if(max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if(max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        return max_so_far;
    }
}