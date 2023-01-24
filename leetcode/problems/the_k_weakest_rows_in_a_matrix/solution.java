class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j] == 0)
                {
                    map.put(i , j);
                    break;
                }
                if(j == n-1)
                {
                    map.put(i , j+1);
                    break;
                }
            }
        } 
        // Sort map by value
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a) - map.get(b));
        
        return list.stream().limit(k).mapToInt(i -> i).toArray();
    }
}