class Solution {
    public int jump(int[] nums) {
       int currEnd = 0, jump = 0;
       int farthest = 0, n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currEnd)
            {
                jump++;
                currEnd = farthest;
            }
       }
       return jump;
    }
}