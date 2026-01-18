class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = candidates.length;
        dfs(candidates, target, 0, result, list);
        
        return result;
    }

    public void dfs(int[] candidates, int target, int i, List<List<Integer>> result,
                    List<Integer> list)
    {
        if(target == 0)
        {
            List<Integer> ans = new ArrayList<>(list);
            result.add(ans);
            return;
        }
        if(i == candidates.length)
            return;
        if(candidates[i] <= target)
        {
            list.add(candidates[i]);
            dfs(candidates, target-candidates[i], i, result, list);
            list.remove(list.size() - 1);
        }
        
        dfs(candidates, target, i+1, result, list);

    }
}