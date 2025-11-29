class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, sum = 0;
        int n = nums.length;
        int len = Integer.MAX_VALUE;
        while(r < n)
        {
            
            sum += nums[r];
            while(sum >= target)
            {
                len = Math.min(len, r-l+1);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}