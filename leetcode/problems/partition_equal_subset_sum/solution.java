class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums)
            sum += num;
        if(sum % 2 != 0)
            return false;
        int target = sum/2;
        Boolean[][] dp = new Boolean[n+1][target+1];
        return solve(nums, n, target, dp);
    }

    public Boolean solve(int[] nums, int n, int target, Boolean[][] dp) {

        if(n == 0)
            return false;

        if(target == 0)
            return true;
        
        if(dp[n][target] != null)
            return dp[n][target];

        if(nums[n-1] <= target)
            return dp[n][target] = solve(nums, n-1, target-nums[n-1], dp) || solve(nums, n-1, target, dp);
        else
            return dp[n][target] = solve(nums, n-1, target, dp);
    }
}