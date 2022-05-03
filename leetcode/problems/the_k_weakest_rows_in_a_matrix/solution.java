class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            map.put(i, getNoOfSoldiers(mat[i]));
        }
        // Sort map by value
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a) - map.get(b));
        return list.stream().limit(k).mapToInt(i -> i).toArray();
    }
    
    private int getNoOfSoldiers(int[] arr)
    {
        int l = 0, h = arr.length-1;
        // Binary Search to find the first index of 0
        while(l<=h)
        {
            int mid = l + (h-l)/2;
            if(arr[mid] == 0)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}