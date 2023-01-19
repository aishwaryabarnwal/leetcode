class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;
        int sum=0;
        if(n==0)
            return new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            int j = i+1;
            int k = n - 1;
            while(j<k)
            {
                sum = nums[i] +nums[j] + nums[k];
                if(sum == 0 )
                {
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                if(sum < 0)
                    j++;
                if(sum > 0)
                    k--;
            }
        }
        return new ArrayList<>(res);
    }
}