class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        backtrack(nums, result, new ArrayList<>(), new boolean[n]);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result, 
                        List<Integer> list, boolean[] used) {
        if(list.size() == nums.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
                continue;
            used[i] = true;
            list.add(nums[i]);
            backtrack(nums, result, list, used);
             // backtrack
            list.remove(list.size() - 1);
            used[i] = false;
        }

    }
}