class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int ans = nums[0];
        int h = nums.length - 1;
        while(l <= h)
        {
            int mid = l + (h-l)/2;
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