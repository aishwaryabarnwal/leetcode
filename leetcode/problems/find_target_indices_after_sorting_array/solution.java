class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, h = n-1, mid = 0;
        while(l<=h)
        {
            mid = l + (h-l)/2;
            if(nums[mid] == target)
            {
                res.add(mid);
                break;
            }
            else if(nums[mid] > target)
                h = mid - 1;
            else
                l = mid + 1;
        }
        int i = mid - 1, j = mid + 1;
        while(i >= 0)
        {
            if(nums[i] == target)
                res.add(i--);
            else 
                break;
        }
        while(j < n)
        {
            if(nums[j] == target)
                res.add(j++);
            else 
                break;
        }
        Collections.sort(res);
        return res;
    }
    //     int c = 0, l = 0;
    //     for(int n : nums)
    //     {
    //         if(n == target)
    //             c++;
    //         if(n < target)
    //             l++;
    //     }
    //     for(int i=0;i<c;i++)
    //     {
    //         res.add(l++);
    //     }
    //     return res;
    // }
    
}