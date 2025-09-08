class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>(); //store indices
        int n = nums.length;
        int l = 0, r = 0;
        int[] ans = new int[n-k+1];
        while(r < n)
        {
            // Maintain decreasing order in deque
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) {
                dq.pollLast();
            }
            dq.offerLast(r);
            if(r-l+1 == k)
            {
                // The maximum is always at the front
                ans[l] = nums[dq.peekFirst()];
                // If leftmost index is out of window, pop it
                if (dq.peekFirst() == l) {
                    dq.pollFirst();
                }               
                l++;
            }
            r++;
        }
        return ans;
    }
}