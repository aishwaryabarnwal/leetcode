class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int l = 0, h = n-1, mid = (l+h)/2;;
        while(l <= h)
        {
            if(target == nums[mid])
                return mid;
            if(target < nums[mid])
                h = mid -1;
            else
                l = mid + 1;
            mid = (l+h)/2;
        }
        return -1;
    }
}