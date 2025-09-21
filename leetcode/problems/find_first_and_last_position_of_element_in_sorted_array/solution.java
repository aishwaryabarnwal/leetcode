class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int l = 0, h = nums.length-1;
        res[0] = bound(nums, target, true);
        res[1] = bound(nums, target, false);
        return res;

    }
    public int bound(int[] nums, int target, boolean isFirst) {
        int l = 0, h = nums.length-1;
        int ans = -1;
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                if (isFirst) 
                    h = mid - 1;  // go left to find first
                else
                    l = mid + 1;  // go right to find last
            }
            else if(nums[mid] > target)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return ans;   
    }
}