class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int res = n - i;
            if(res <= nums[i] && (i-1<0 || res>nums[i-1]))
                return res;
        }
        return -1;
    }
}