class Solution {
    public int lastStoneWeight(int[] stones) {
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int s : stones)
            pq.add(s);
        while(pq.size() > 1)
        {
            int x = pq.poll(); //max Heap x always greater than y
            int y = pq.poll();
            pq.add(x-y);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}