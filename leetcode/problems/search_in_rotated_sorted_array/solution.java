class Solution {
    public int search(int[] nums, int target) {
      
        int l = 0, h = nums.length - 1;
        int minIdx = 0;
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
        System.out.println(minIdx);
        int ans1 = binarySearch(nums, 0, minIdx-1, target);
        if(ans1 >= 0)
            return ans1;
        return binarySearch(nums, minIdx, nums.length - 1, target);
    }
    public int binarySearch(int[] nums, int l, int h, int target)
    {
        while(l <= h)
        {
            int mid = l + (h-l) / 2;
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