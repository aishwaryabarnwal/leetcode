class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int res = Integer.MIN_VALUE;
        int start = 0, zeroCount = 0;
        int n = nums.length;
        for(int end=0;end<n;end++)
        {
            if(nums[end] == 0)
            {
                zeroCount++;
            }
            while(zeroCount > k) //if can also be used in this question
            {
                if(nums[start] == 0)
                {
                    zeroCount--;
                }
                start++;
            }
            res = Math.max(res, end - start + 1);
        }
        return res;
    }
}