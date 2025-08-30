class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = 0; // how many elements moved

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev; // place the previous value in its new position
                prev = temp;       // update prev with the displaced value
                current = next;
                count++;
            } while (start != current); // cycle complete
        }
    }
}