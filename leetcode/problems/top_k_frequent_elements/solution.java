class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a)-map.get(b));
        for (int key : map.keySet()) {
             minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest frequency
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            res[i] = minHeap.poll();
        }
        return res;  
    }
}