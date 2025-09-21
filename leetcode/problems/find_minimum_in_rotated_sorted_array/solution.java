class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        int ans = nums[0];
        if(nums[l] < nums[h])
            return nums[l];
        while(l <= h)
        {
            int mid = l + (h-l) / 2;
            if(nums[mid] < nums[0])
            {
                ans = nums[mid];
                h = mid - 1;
            }
            else
                l = mid + 1;
        }
        return ans;
    }
}