class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        int l = 0, r = 0;
        while(r < n)
        {
            //Maintain deque in descreasing order
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[r])
                dq.pollLast();
            dq.offerLast(r);

            if(r-l+1 == k)
            {
                //maximum ans is always at the front
                ans[l] = nums[dq.peekFirst()];

                // if leftmost index is out of window, pop it
                if(dq.peekFirst() == l)
                    dq.pollFirst();

                l++;
            }
            r++;
        }
        return ans;
    }
}