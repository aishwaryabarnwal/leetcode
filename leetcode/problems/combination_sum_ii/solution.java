class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, candidates, target, result, new ArrayList<>());
        return result;
    }

    public void dfs(int start, int[] candidates, int target, 
                    List<List<Integer>> result, List<Integer> list)
    {
        if(target == 0)
        {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<candidates.length;i++)
        {
            if(i > start && candidates[i] == candidates[i-1])
                continue;
            
            if(candidates[i] > target)
                break;
            
            list.add(candidates[i]);
            dfs(i+1, candidates, target-candidates[i], result, list);
            list.remove(list.size() - 1);
        }
    }
}