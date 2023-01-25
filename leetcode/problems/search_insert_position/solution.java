class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length;
        int mid = l + (h-l)/2;
        while(l<h)
        {
            if(target == nums[mid])
                return mid;
            else if(target < nums[mid])
            {
                h = mid;
            }
            else
            {
                l =  mid+1;
            }
            mid = l + (h-l)/2;
        }
        return l;
    }
}