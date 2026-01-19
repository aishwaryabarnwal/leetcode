class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(1, n, k, result, new ArrayList<>());
        return result;
    }

    public void dfs(int start, int n, int k, List<List<Integer>> result, List<Integer> list) {
        
        if(list.size() == k)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i <= n - (k - list.size()) + 1;i++) //i <= n - (k - list.size()) + 1
        {
            list.add(i);            
            dfs(i + 1, n, k, result, list); 
            list.remove(list.size() - 1);   
        }
        
    }
}