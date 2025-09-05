class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = Integer.MIN_VALUE, sum = 0;
        int i = 0, j = 0;
        int n = nums.length;
        Set<Integer> mp = new HashSet<>();
        while(j < n)
        {
            if(! mp.contains(nums[j]))
            {
                sum += nums[j];
                mp.add(nums[j]);
                if(j-i+1 == k)
                {
                    maxSum = Math.max(maxSum, sum);
                    sum -= nums[i];
                    mp.remove(nums[i]);
                    i++;
                }
            }
            else
            {
                while(nums[i] != nums[j])
                {
                    sum -= nums[i];
                    mp.remove(nums[i]);
                    i++;
                }
                i++;
            }
            j++;
        }
        return maxSum==Integer.MIN_VALUE?0:maxSum;
    }
}