class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n, mid = l + (h-l)/2;
        while(l < h)
        {
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                l = mid + 1;
            else
                h = mid;
            mid = l + (h-l)/2;
        }
        return h;
    }
}