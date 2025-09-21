class Solution {
    public int searchInsert(int[] nums, int target) {
        int h = nums.length-1;
        int l = 0;
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            if(target == nums[mid])
                return mid;
            else if(target < nums[mid])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}