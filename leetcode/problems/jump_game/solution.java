class Solution {
    public boolean canJump(int[] nums) {
        //dp
        int n = nums.length;
        Boolean [] dp = new Boolean[n+1];
        boolean res = jump(nums, 0, n, dp); 
        return res;     
    }

    public boolean jump(int[] nums, int pos, int n, Boolean[] dp)
    {
        if(pos == n-1)
            return dp[pos] = true;
        if(nums[pos] == 0)
            return dp[pos] = false;
        if(dp[pos] != null)
            return dp[pos];
        for(int i=pos+1;i<=pos+nums[pos];i++)
        {
            if(jump(nums, i, n, dp))
            {
                return dp[pos] = true;
            }
        }
        return dp[pos] = false;
    }
}