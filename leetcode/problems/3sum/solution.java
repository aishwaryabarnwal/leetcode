class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
       int l = 0, r = n - 1;
       Arrays.sort(nums);
       List<List<Integer>> res = new ArrayList<>();
       while(l < r)
       {
            int target = - nums[l];
            int m = l + 1;
            while(m < r)
            {
               int sum = nums[m] + nums[r];
                if(sum == target)
                {      
                    res.add(Arrays.asList(nums[l], nums[m], nums[r]));
                    m++;
                    r--;
                    while (m < r && nums[m] == nums[m - 1]) m++;
                    while (m < r && nums[r] == nums[r + 1]) r--;
                }
                else if(sum < target) 
                    m++;
                else 
                    r--;
            }
            l++;
            while (l < n - 1 && nums[l] == nums[l - 1]) 
                l++;
            r = n - 1; 
       }
       return res;
    }
}