class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        int ans = 0;
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            if(nums[mid] < nums[0])
            {
                ans = mid;
                h = mid - 1;
            }
            else
                l = mid + 1;
        }
        int val1 = binarySearch(nums, 0, ans-1, target);
        if(val1 >= 0)
            return val1;
        int val2 = binarySearch(nums, ans, nums.length-1, target);
            return val2;
    }
    public int binarySearch(int[] nums, int l, int h, int target) {
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}