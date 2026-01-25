class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0; int h = n - 1;
        int minIdx = nums[0];
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            if(nums[mid] < nums[0])
            {
                minIdx = mid;
                h = mid - 1;
            }
            else 
                l = mid + 1;
        }
        int x = binarySearch(nums, 0, minIdx-1, target);
        if(x >= 0)
            return x;
        return binarySearch(nums, minIdx, n-1, target);
    }
    public int binarySearch(int[] nums, int l, int h, int target)
    {
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return -1;
    }
}