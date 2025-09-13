class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int n = nums.length;
        int tempK = k;
        int len = 0, currLen = 0;
        while(r < n)
        {
            if(nums[r] == 0)
                tempK--;
            while(tempK < 0)
            {
                if(nums[l] == 0)
                    tempK++;
                l++;
            }
            
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}