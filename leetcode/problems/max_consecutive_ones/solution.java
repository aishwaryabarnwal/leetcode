class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = Integer.MIN_VALUE;
        int ones = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
                ones++;
            else{
                res = Math.max(res, ones);
                ones = 0;
            }
        }
        return Math.max(res, ones);
    }
}