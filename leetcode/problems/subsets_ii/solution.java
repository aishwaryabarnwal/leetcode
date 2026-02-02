class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;

    }

    public void backtrack(int[] nums, int idx, List<Integer> curr, List<List<Integer>> res)
    {

        res.add(new ArrayList<>(curr));

        for(int i=idx;i<nums.length;i++)
        {
            if (i > idx && nums[i] == nums[i - 1]) //step 2: skip duplicates
                continue;

            curr.add(nums[i]);
            backtrack(nums, i+1, curr, res);
            curr.remove(curr.size() - 1);

        }

    }
}